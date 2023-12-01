package com.pinguela.shop.enunciado2;

public class Coche {
	private Motor motor = null;
	private String marca = null;
	private String modelo = null;
	private double costeAverias = 0.0d;
	
	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public double getCosteAverias() {
		return costeAverias;
	}
	
	public void acumularAveria(double coste) {
		this.costeAverias+=coste;
	}
	
	@Override
	public String toString() {
		return "Coche={marca:"+marca
				+",modelo:"+modelo
				+",motor: "+motor+"}";
	}
		
}
