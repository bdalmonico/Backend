package atividades;

public class ArrayUtils {

	public static int[] extraerColumna(int a[][], int c) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i][c];
			System.out.println(b);
		}
		return b;
	}

	/**
	 * Comparar dos arrays posicion a posicion.
	 * 
	 * @param a Array uno
	 * @param b Array dos
	 * @return true si todas las posiciones son iguales o false si son de tamaños
	 *         diferentes o bien alguna de las posiciones no coincide.
	 */

	public static boolean comparar(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * sumar arrays simples
	 */
	public static int[] sumar(int[] a, int[] b) {
		int[] soma = new int[a.length];

		if (a.length != b.length) {
			throw new IllegalArgumentException("Parametros tem tamanhos distintos");
		}
		for (int i = 0; i < a.length; i++) {
			soma[i] = a[i] + b[i];
		}
		return soma;
	}

	/**
	 * Sumar todos os valores dentro de um array simples
	 */

	public static int sumarTodos(int[] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}

		return total;
	}

	public static int sumarPares(int[] a) {
		int total = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				total += a[i];
			}
		}
		return total;
	}

	public static double media(int[] a) {
		double media = 0.0d;
		double suma = 0.0;

		for (int i = 0; i < a.length; i++) {
			suma += a[i];
		}
		media = suma / a.length;
		return media;
	}

	
	public static int minimo(int[]a) {
		int minimo=Integer.MAX_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i]<minimo) {
				minimo=a[i];
			}
		}
		return minimo;
	}
	public static int maximo(int[]a) {
		int maximo = Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i]>maximo) {
				maximo=a[i];
			}
		}
		return maximo;
	}
	
	public static int[] subArray(int[]a, int inicio, int fin) {
		int[] subArray = new int [fin-inicio];
		int contador=0;
		for(int i=inicio; i<fin; i++) {
			subArray[contador] = a[i];
			contador++;
		}
		return subArray;
	}
	
	
}
