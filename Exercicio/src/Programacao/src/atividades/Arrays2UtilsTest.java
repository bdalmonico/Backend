package Programacao.src.atividades;


public class Arrays2UtilsTest {

	public static void main(String[] args) {
		/**
		 * Criado um array a manivela e usando o metodo print para imprimir
		 * os valores desse array
		 */
		int[][] a;
		a = new int[][] {
			{ 00, 01, 02, 03},
			{ 10, 11, 12, 13},
			{ 20, 21, 22, 23},
			{ 30, 31, 32, 33}
		};	
		int[][] d;
		d = new int[][] {
			{ 00, 01, 02, 03},
			{ 10, 11, 12, 13},
			{ 20, 21, 22, 23},
			{ 30, 31, 32, 33}
		};	
		
		char[][] b;
		b = new char[][] {
			{'a','b','c'},
			{'d','e','f'},
			{'g','h','i'}
		};
		
//		Arrays2ConsoleUtils.print(a);
//		int[]c=ArrayUtils.extraerColumna(a, 0);
//		ArrayConsoleUtils.imprimir(c);
		
		/**Usando o metodo que cria um array com tamano que eu uso como parametro
		 * e usando o metodo para imprimir os valores desse array
		*/
//		int[][] b;
//		b = Arrays2ConsoleUtils.leer(3, 3);		
//		Arrays2ConsoleUtils.print(b);
		
		
		
		/**
		 * Utilizando um metodo que cria a moldura de um quadrado de acordo
		 * com valores ingressados nos parametros de entrada
		 */
//		Arrays2ConsoleUtils.crearCuadrado(5);
		
		
		
		/**
		 * Utilizando um metodo que cria diagonais inversas do tamanho 
		 * ingressado como parametro de entrada
		 */
//		Arrays2ConsoleUtils.crearDiagonales(10);
		
		
		
		/**
		 * Utilizando um metodo para devolver o maior valor de
		 * um array bidimencional
		 */
//		Arrays2Utils.maiorValor(a);
		
		
		
		/**
		 * Verifica os valores de uma fila indicada de um char[][]
		 * e devolve esses valores em um char[]
		 */
//		Arrays2Utils.getFila(b,2);
		
		
		
		/**
		 * Verifica os valores de uma columna indicada de um char[][]
		 * e devolve esses valores em um char[]
		 */
//		Arrays2Utils.getColumna(b,2);
		
//		Arrays2Utils.getMinimoFila(a,1);
//		
		
		
		/**
		 * Metodo que inverte filas e columnas de um array bidimencional
		 */
//		System.out.println("Array invertido");
//		int[][]c = Arrays2Utils.intercambiarFilasColumnas(a);
//		Arrays2ConsoleUtils.print(c);
		
		/**
		 * Metodo que soma dois arrays bidimencionais de mesmo tamanho
		 * em seguida é inserido dentro de um metodo que imprime arrays
		 */
//		int[][]j= Arrays2Utils.sumaMatrices(a, d);
//		Arrays2ConsoleUtils.print(Arrays2Utils.sumaMatrices(a, d));
		
		
		/**
		 * Metodo que devolve as coordenadas de um char inserido como parametro
		 * que pertence a um array de char[][] 
		 */
		ArrayConsoleUtils.print(Arrays2Utils.getCoordenadas(b, 'i'));
		
	}

}