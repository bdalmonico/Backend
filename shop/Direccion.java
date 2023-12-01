package shop;

public class Direccion {
	
	private char tipoVia;
	private String nombreVia = null;
	private String direccionVia = null;

	public Direccion() {
		
	}

	public char getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(char tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombreVia() {
		return nombreVia;
	}

	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}

	public String getDireccionVia() {
		return direccionVia;
	}

	public void setDireccionVia(String direccionVia) {
		this.direccionVia = direccionVia;
	}
	
	@Override
	public String toString() {
		return "Direccion={tipoVia:"+getTipoVia()
						+",nombreVia:"+this.nombreVia;
	}
}
