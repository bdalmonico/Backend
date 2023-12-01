package com.prog.brunodalmonico.p3;

import java.util.Scanner;

public class ValidadorTest {

	public static void main(String[] args) {
		String senha;
		Scanner kb = new Scanner(System.in);
		System.out.println("Escriba una frase:");
		senha = kb.nextLine();

		System.out.println(Validador.validador(senha));
	}

}
