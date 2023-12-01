package Programacao.src.com.pinguela.shop;

import java.util.Date;

public class Empleado {

	private String nombre;
	private Date fechaNacimiento;
	private double salario;
	private double bonus;
	
	private Direccion direccion;
	
	public Empleado() {
	}
	
	@Deprecated
	public Empleado(String nombre) {
		this();
		setNombre(nombre);
	}
	
	@Deprecated
	public Empleado(String nombre, Date fechaNacimiento) {
		this(nombre);
		setFechaNacimiento(fechaNacimiento);
	}
	
	@Deprecated
	public Empleado(String nombre, Date fechaNacimiento, double salario) {
		this(nombre,fechaNacimiento);
		setSalario(salario);
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonus() {
		return this.bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	/**
	 * Obtiene el salario total de un empleado.
	 * @return Valor decimal con el salario.
	 */
	public double getSalarioTotal() {
		return getSalario()+getBonus();
	}
	
	public Direccion getDireccion() {
		return direccion;
	}
	
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Empleado={nombre:"+this.nombre
				+",fechaNacimiento:"+this.getFechaNacimiento()
				+",salario:"+getSalario()
				+",bonus:"+getBonus()
				+",direccion:"+getDireccion();
	}
	
	
}
