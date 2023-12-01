package com.prog.brunodalmonico.p4;

public class Array2Utils {

	public static int[] suma(int[][] a) {
		int[] b = new int[a[0].length];

		for (int i = 0; i <= a.length; i++) {
			int soma = 0;
			for (int j = 0; j < a.length; j++) {
				soma += a[j][i];
			}
			b[i] = soma;

		}
		return b;
	}

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
