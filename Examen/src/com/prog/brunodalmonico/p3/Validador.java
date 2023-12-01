package com.prog.brunodalmonico.p3;

public class Validador {

	public static boolean validador(String a) {

		char c = 0;
		boolean letras = false;
		boolean digitos = false;
		boolean simbolos = false;
		if ((a.length() <= 12) && (a.length() >= 8)) {
			for (int i = 0; i < a.length(); i++) {
				c = a.charAt(i);
				if ((('a' <= c) && (c <= 'z')) || (('A' <= c) && (c <= 'Z'))) {
					letras = true;
				} else if (('0' <= c) && (c <= '9')) {
					digitos = true;
				} else if (c == '.' || c == ',' || c == ';') {
					simbolos = true;
				}
			}
			if (letras == true && digitos==true && simbolos==true ) {
				return true;
			}

		}
		return false;

	}

}

//for (int i = 0; i<linea.length(); i++) {
//if (linea.charAt(i)==letraUsuario) {
//	i='c';
//}			
//}

//for (int i = 0; i<frase.length(); i++) {
//	c = frase.charAt(i);
//	if ((('a'<=c)&&(c<='z'))
//			|| (('A'<=c)&&(c<='Z'))) {
//		numLetras++;
//	} else if (('0'<=c)&&(c<='9')) {
//		numDigitos++;
//	} else if (c==' ') {
//		numBlancos++;
//	} else {
//		numOtros++;
//	}
//}
//Sy