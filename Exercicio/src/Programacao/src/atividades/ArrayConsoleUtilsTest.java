package atividades;

public class ArrayConsoleUtilsTest {

	public static void main(String[] args) {
		int[] a = new int[3];
		a = new int[] { 1, 2, 3, 4 };
		int[] f = new int[] { 1, 2, 3, 4 };
		int[][] c = new int[][] { { 1, 2, 3, 4 }, { 3, 4, 1, 4 } };

		
		System.out.println(ArrayUtils.sumarTodos(a));
		System.out.println(ArrayUtils.sumarPares(a));
		System.out.println(ArrayUtils.media(a));
		System.out.println(ArrayUtils.minimo(a));
		System.out.println(ArrayUtils.maximo(a));
		ArrayConsoleUtils.print(ArrayUtils.subArray(a,0,2));
		System.out.println();
		System.out.println();
		
		
		ArrayConsoleUtils.print(ArrayUtils.sumar(a, f));
		System.out.println();
		System.out.println(ArrayUtils.comparar(a, f));
		ArrayConsoleUtils.print(a);
		System.out.println();
		int[] b = ArrayConsoleUtils.criarArrayInteiros(4);
		ArrayConsoleUtils.print(b);
		ArrayConsoleUtils.print(ArrayUtils.extraerColumna(c, 2));
		

	}

}
