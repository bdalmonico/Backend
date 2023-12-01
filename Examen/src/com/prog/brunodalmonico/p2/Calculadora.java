package com.prog.brunodalmonico.p2;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		double resultado = 0.0d;
		double n2 = 0.0d;
		char operacion = 0;
		
		try (Scanner kb = new Scanner(System.in)) {
			
			System.out.println("Calculadora básica");
			System.out.println("Introduzca los números y operaciones alternativamente, empezando por un número.");
			System.out.println("(Operación = para finalizar)");

			resultado = kb.nextDouble();
			operacion = kb.next().charAt(0);

			while (operacion != '=') {
				if (operacion == '+') {
					n2 = kb.nextDouble();
					resultado += n2;
				} else if (operacion == '-') {
					n2 = kb.nextDouble();
					resultado -= n2;
				} else if (operacion == '*') {
					n2 = kb.nextDouble();
					resultado *= n2;
				} else if (operacion == '/') {
					n2 = kb.nextDouble();
					resultado /= n2;
				}
				operacion = kb.next().charAt(0);
			}
		}
		System.out.println("Resultado: " + resultado);
	}
}