package com.danilo.alura.java.sintaxebasicaefluxo;

public class TestaCaracteres {

	public static void main(String[] args) {

		char letra = 'a';
		System.out.println(letra);

		char valor = 65;
		System.out.println(valor); // guarda caractere da tabela UNICODE

		// valor = valor + 1; // N�o compila
		valor = (char) (valor + 1);
		System.out.println(valor);

		String palavra = "alura cursos online de tecnologia";
		System.out.println(palavra);

		palavra = palavra + 2020;
		System.out.println(palavra);
	}
}
