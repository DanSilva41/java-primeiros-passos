package com.danilo.alura.java.sintaxebasicacondicionalloops;

public class TestaLacos2 {

	public static void main(String[] args) {
		for (int linha = 1; linha <= 10; linha++) {
			for (int coluna = 1; coluna <= linha; coluna++) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}
	}
}
