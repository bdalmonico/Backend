package atividades;

public class Arrays2Utils {

	/**
	 * Metodo que verifica o maior valor de um array bidimencional
	 * 
	 * @param Array bidimencional
	 * @return Maior valor desse array
	 */
	public static void maiorValor(int[][] a) {
		int maior = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if ((i == 0 && j == 0) || a[i][j] >= maior) {
					maior = a[i][j];
				}
			}
		}
		System.out.println("O maior valor do array é: " + maior);
	}

	/**
	 * Metodo que verifica os valores da fila de um array char[][]
	 * 
	 * @param 1º Um array bidimencional, 2º uma fila a verificar
	 * @return Array unidimencional
	 */
	public static char[] getFila(char[][] a, int fila) {
		char[] b = new char[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == fila) {
					System.out.println("Guardando valor de: [" + i + "] [" + j + "]");
					b[j] = a[i][j];
				}
			}
		}
		System.out.println(b);
		return b;
	}

	/**
	 * Metodo que verifica os valores da columna de um array char[][]
	 * 
	 * @param 1º Um array bidimencional, 2º uma columna a verificar
	 * @return Array unidimencional
	 */
	public static char[] getColumna(char[][] a, int columna) {
		System.out.println();
		char[] b = new char[a.length];
		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				if (j == columna) {
					System.out.println("Guardando valor de: [" + i + "] [" + /**j*/ columna + "]");
					b[i] = a[i][/**j*/columna];
//				}
//			}
		}
		System.out.println(b);
		return b;
	}
	
	
	/**
	 * Metoro que devolve o menor valor de uma fila de um int[][]
	 * @param a
	 * @param fila
	 * @return menor valor da fila de int[][]
	 */
	public static int getMinimoFila(int[][] a, int fila) {
		System.out.println();
		int menor=0;
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == fila) {
					if ((i==fila&&j==0)||a[i][j] <= menor) {
						menor = a[i][j];
					}
				}
			}
		}
		System.out.println("O menor valor da fila "+ fila + " é: " + menor);
		return menor;
	}

	
//	6) Suma de dos matrices del mismo tamaño:
//		public static int[][] sumar(int[][] m1, int[][]m2)
//		En la suma de matrices, se suman las mismas posiciones de las matrices sumadas.
//
		public static int[][] sumaMatrices(int[][]a, int[][]b){
			int[][]r=new int[a.length][a.length]; //array resultado do mesmo tamanho de a e b
			for (int i=0; i<a.length; i++) {
				for(int j=0; j<a.length; j++) {
					r[i][j]= a[i][j]+b[i][j];
					
				}
			}
			System.out.println(r);
			return r;
			
		}
	
	
	
//		7) Crear un array resultado del intercambio de filas y columnas de un array de entrada.
//		Ejemplo:
//		{2,5,8}
//		{4,6,1}
//		resultará en:
//		{2,4}
//		{5,6}
//		{8,1}

		public static int[][] intercambiarFilasColumnas(int[][] a) {
//			int [][] a=new int[f][c]
			int [][] b=new int[a[0].length][a.length];
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					b[j][i]=a[i][j];
				}
			}
			System.out.println();
			return b;
			
		}
	
	
	
	
	
	
//		8) Obtiene las coordenadas x, y (esto es, fila y columna) de un carácter en un array bidimensional.
//		Las coordenadas estarán en un array de enteros de salida, que tendrá longitud 2 (obviamente)
//		donde la primera posición será la coordenada x y la segunda posición será la coordenada y.
//		Asumir que la letra no se repite, esto es, cuando se encuentre ya se puede finalizar la búsqueda.
//		public static int[] getCoordenadas(char c)
//
//		Ejemplo:
//		'm' 'b' 'c' 'b'
//		'k'  'n' 'a' 'x'
//		't'  'b'  'c' 'y'
//
//		getCoordenadas('a') retornaría: {1,2}
		
		public static int[] getCoordenadas(char[][]a, char c) {
			int []b = new int[2];
			for(int i=0; i<a.length;i++) {
				for(int j=0; j<a.length; j++) {
					if(a[i][j]==c) {
						b[0]=i;
						b[1]=j;
					}
				}
			}
			return b;
			
		}
		
		
		
//
//		9) Método que determina si una posición de un array es un punto de silla. Un punto de silla
//		es aquel que es el mínimo de su fila y el máximo de su columna.
//		public static boolean isPuntoSilla(int[][] a, int fila, int columna)
}
