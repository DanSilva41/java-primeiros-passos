package com.danilo.alura.java.sintaxebasicaefluxo;

public class TestaVariaveis {

	public static void main(String[] args) {
		double salario;
		salario = 1250.70;
		System.out.println("meu salário é " + salario);

		double divisao = 3.14 / 2;
		System.out.println(divisao);

		// int valor = 12.5; // não compila
		// int valor2 = 0.0; // não compila
		// double teste = 125.50; // compila
		// int valor3 = teste; // não compila

		int divisaoInteira = 5 / 2;
		System.out.println(divisaoInteira); // saída = 2
		
		double divisaoPontoFlutuante = 5.0 / 2;
		System.out.println(divisaoPontoFlutuante); // saída = 2.5
		
	}
}
