package enunciado1;

import java.util.Random;

public class Profesor {
	/**
	 * Método de redondeo que desde ,5 sube y menos de ,5 baja.
	 */
	public static final int REDONDEO_MEDIO = 1;
	/**
	 * Método de redondeo que trunca, esto es, redonde siempre
	 * al entero anterior.
	 */
	public static final int REDONDEO_ABAJO = 2;
	
	/**
	 * Método de redondeo hacia arriba, es decir, al entero superior.
	 */
	public static final int REDONDEO_ARRIBA = 3;
	
	
	private static final Random ALEATORIO = new Random(System.currentTimeMillis());

	// Sesgo el profesor al evaluar
	private double sesgo = 0.0d;
	
	// Metodología de redondeo
	private int metodoRedondeo = 1;
	
	public Profesor() {	
		sesgo = ALEATORIO.nextDouble();		
	}
	
		
	public int getMetodoRedondeo() {
		return metodoRedondeo;
	}


	public void setMetodoRedondeo(int metodoRedondeo) {
		this.metodoRedondeo = metodoRedondeo;
	}


	public void ponerNotas(Alumno a) {
		/*Asignatura[] asignaturas = a.getAsignaturas();
		double notaAleatoria;		
		for (int i = 0; i<asignaturas.length; i++) {
			notaAleatoria = ALEATORIO.nextDouble()*9 + this.sesgo; 
			asignaturas[i].setCalificacion(notaAleatoria);
		}
		*/
		
		for (Asignatura asignatura: a.getAsignaturas()) {
			asignatura.setCalificacion(
					ALEATORIO.nextDouble()*9 + this.sesgo);
		}
		
		
		/*
		for (int i = 0; i<a.getAsignaturas().length; i++) {
			a.getAsignaturas()[i].setCalificacion(
						ALEATORIO.nextDouble()*9 + this.sesgo);
		}
		*/
	}
	
	public static double calcularMedia(Alumno a) {
		double suma = 0.0d;
		/*
		for (Asignatura asignatura:a.getAsignaturas()) {
			suma = suma + asignatura.getCalificacion();
		} 
		*/
		Asignatura[] asignaturas = a.getAsignaturas();
		for (int i = 0; i<asignaturas.length; i++) {
			suma+=asignaturas[i].getCalificacion();
		}
		
		return suma/a.getAsignaturas().length;		
	}
	
	public double redondearNota(double nota) {
		if (metodoRedondeo==1) {
			return Math.round(nota);
		} else if (metodoRedondeo==2) {
			return Math.floor(nota);
		} else if (metodoRedondeo==3) {
			return Math.ceil(nota);
		} else {
			return nota;
		}
	}
}
