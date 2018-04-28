package com.danilo.alura.java.sintaxebasicacondicionalloops;

public class TestaFatorial {
	public static void main(String[] args) {
		int fatorial = 1;
		// int resultado = 1;

		// for (; fatorial > 0; fatorial--) {
		// resultado *= fatorial;
		// }
		// System.out.println(resultado);

		for (int i = 1; i < 7; i++) {
			fatorial *= i;
			System.out.println("Fatorial de " + i + " = " + fatorial);
		}
	}

}
