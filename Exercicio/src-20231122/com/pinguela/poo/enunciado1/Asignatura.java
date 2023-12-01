package com.pinguela.poo.enunciado1;

public class Asignatura {

	private int id = 0;
	private double calificacion = 0.0d;
	
	public Asignatura(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public double getCalificacion() {
		return calificacion;
	}
	
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
}
