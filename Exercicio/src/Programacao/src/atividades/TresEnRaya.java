package atividades;

import java.util.Scanner;

public class TresEnRaya {

	//	!hayGanador(tablero)? true:false; metodo simplificado de fazer um if(){}

	public static char[][] initTablero(char[][] tablero) {
		System.out.println("Asignando valores al tablero.");
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] = ' ';
			}
		}
//		tablero[0][1] = 'x';
//		tablero[2][1] = 'x';
//		tablero[1][1] = 'x';
		return tablero;

	}

	public static boolean hayGanador(char[][] tablero) {
		boolean hayGanador = true;
		//		LINHAS
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (i==0&&j==0|| tablero[i][0] != tablero[i][j] ) {
					hayGanador = false;

				}
			}
		}
		//COLUNAS
		for(int j=0; j<tablero.length; j++) {
			for (int i=0; i<tablero.length; i++) {
				if( tablero[0][j]!=tablero[i][j]) {
					hayGanador=false;
				}
			}
		}
		
		//		DIAGONAL1
		//		DIAGONAL2

		return hayGanador;
	}

	public static boolean hayEmpate(char[][] tablero) {
		if (hayGanador(tablero)) {
			return false;
		}
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if (tablero[i][j] == ' ') {
					return false;
				}
			}
		}

		return true;

	}

	public static int leerCoordenada(char eje) {
		int coordenada;
		System.out.println("Insira a coordenada " + eje);
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();

	}

	public static boolean isPosicionLibre(char tablero[][], int x, int y) {
		if (tablero[x][y] == ' ') {
			System.out.println("Posicion Libre");
			return true;
		} else {
			System.out.println("Posicion ocupada");
			return false;
		}

	}

	public static void colocarFicha(char tablero[][], int x, int y, char ficha) {
		if (isPosicionLibre(tablero, x, y) == true) {
			System.out.println("Colocar ficha");
			tablero[x][y] = ficha;
		}
	}

	public static char cambiarTurno(char ficha) {
		if (ficha == 'x') {
			ficha = 'o';
		} else if (ficha == 'o') {
			ficha = 'x';
		}
		return ficha;
	}

	public static void main(String[] args) {
		char[][] tablero = new char[3][3];
		int x, y;
		char ficha = 'o';

		tablero = initTablero(tablero);
		Arrays2ConsoleUtils.printChar(tablero);
		System.out.println("Jogo tres en raya");
		System.out.println(hayGanador(tablero));
		

		while (!hayGanador(tablero) && !hayEmpate(tablero)) {
			x = leerCoordenada('x');
			y = leerCoordenada('y');
			if (isPosicionLibre(tablero, x, y)) {
				colocarFicha(tablero, x, y, ficha);
				Arrays2ConsoleUtils.printChar(tablero);
			} else {
				System.out.println("Posicion ocupada");
				Arrays2ConsoleUtils.printChar(tablero);
			}
			hayGanador(tablero);
			ficha = cambiarTurno(ficha);

		}
		System.out.println("Ganhou o jogo");

	}

}
