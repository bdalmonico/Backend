package shop;

import java.sql.*;

public class JDBCHelloWorld {

	public static final String DB_URL = "jdbc:mysql://10.63.11.117:3306/yourpc_test";
	public static final String USER = "aperebaskine";
	public static final String PASS = "abc123.";



	public static Producto findById(int id) {
		Producto p = null;
		try {
			// Open a connection
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(
					 " SELECT ID, NAME, STOCK, PRICE"
					+" FROM PRODUCT "
					+" WHERE ID = " + id
					);

			
			// Extract data from result set
			p = new Producto();
			
			
			while (rs.next()) {
				p.setId(rs.getInt("ID"));
				p.setNombre(rs.getString("NAME"));
				p.setStock(rs.getInt("STOCK"));
				p.setPrecio(rs.getDouble("PRICE"));				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return p;
	}
	
	public static void main(String[] args) {
		Producto p = findById(3);
		System.out.println("Producto: "+p.getId()+", nombre = "+p.getNombre());
	}
}
