package com.prog.brunodalmonico.p5;

import java.util.Random;
import java.util.Scanner;

public class PalabraIncognita {
	public static final int INTENTOS = 5;

	public static int[] posiciones(String a) {
		int posicionOcupada = 0;
		int guion = 0;
		int posicion = 0;
		int metade = 0;
		int contador = 0;
		int[] b = new int[a.length() / 2];
		Random r = new Random(System.currentTimeMillis());
		
		while (guion <= b.length) {
			posicion = r.nextInt(a.length());
			if (posicion != posicionOcupada) {
				b[contador] = posicion;
				contador++;
			}
			posicionOcupada = posicion;
			guion++;
		}
		return b;
	}

	public static void main(String[] args) {
		int intento = 0;
		String palavra = null;
		Scanner kb = new Scanner(System.in);
		System.out.println("digite a palavra a adivinhar");
		palavra = kb.nextLine();
		System.out.println("insira o numero de intentos");
		intento = kb.nextInt();
		while (intento <= INTENTOS) {

			intento++;
		}

	}

}
