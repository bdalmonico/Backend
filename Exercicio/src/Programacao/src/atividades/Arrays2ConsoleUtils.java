package atividades;

import java.util.Scanner;

public class Arrays2ConsoleUtils {

	public static int[][] leer(int filas, int columnas) {
		int[][] a = new int[filas][columnas];

		Scanner kb = new Scanner(System.in);
		
		System.out.println("Você vai criar um array de " + filas +
				" filas e " + columnas + " columnas.");
		
		for (int i = 0; i < a.length /* filas */; i++) {
			for (int j = 0; j < a[i].length /* columnas */; j++) {
				System.out.println("Introduzca el valor para fila"
						+ " [" + i + "]" + " e columna [" + j + "]: ");
				a[i][j] = kb.nextInt();
			}
		}
		return a;
	}

	public static void print(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			// ArrayConsoleUtils.print(a[i]);
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
				if (j < a[i].length - 1) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}
	
	public static void printChar(char[][] a) {
		for (int i = 0; i < a.length; i++) {
			// ArrayConsoleUtils.print(a[i]);
			System.out.print("[");
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
				if (j < a[i].length - 1) {
					System.out.print("][");
					
				}
			}
			System.out.print("]");
			System.out.println();
		}
	}

	/**
	 * Crea un array de dos dimensiones con igual ancho que alto, cuyos valores son
	 * ' ' en todas las posiciones salvo en los bordes, donde deberá tener '*'.
	 * 
	 * @return Array del tamaño pedido y con '*' en los bordes.
	 */
//		int lado=6;
	public static char[][] crearCuadrado(int lado) {
		char[][] a = new char[lado][lado];

		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				if (j == 0 || i == 0 || j == a.length - 1 || i == a.length - 1) {
					a[i][j] = '*';
					System.out.print(a[i][j]);
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		return a;
	}

	/**
	 * Crea un array de dos dimensiones con igual ancho que alto, cuyos valores son
	 * ' ' en todas las posiciones en las diagonales
	 * 
	 * @return Array del tamaño pedido y con '*' en las diagonales.
	 */
	public static char[][] crearDiagonales(int lado) {
		char[][] a = new char[lado][lado];

		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				if (j == i || i + j == a.length - 1) {
					a[i][j] = '*';
					System.out.print(a[i][j]);
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		return a;
	}

}
