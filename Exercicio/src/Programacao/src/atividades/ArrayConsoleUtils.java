package Programacao.src.atividades;

import java.util.Scanner;

public class ArrayConsoleUtils {

	/**
	 * Cria um array com um tamanho imposto como paramentro
	 * @param tamanho
	 * @return
	 */
	public static int[] criarArrayInteiros(int tamanho) {
		System.out.println("Vamos criar um array de tamanho: " + tamanho);
		int[] a = new int[tamanho];
		Scanner kb = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.println("Insira o numero da posição " + i + " :");
			a[i] = kb.nextInt();
		}

		return a;
	}
	/**
	 * Imprime um array simples
	 * @param a
	 */
	public static void print(int[] a) {
		System.out.print("Array: [");
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + ", ");
		}

		if (a.length - 1 > 0) {
			System.out.print(a[a.length - 1]);
		}
		System.out.print("]");
	}
}
