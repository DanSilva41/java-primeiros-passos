package com.danilo.alura.java.sintaxebasicaefluxo;

public class TestaVariaveis {

	public static void main(String[] args) {
		double salario;
		salario = 1250.70;
		System.out.println("meu sal�rio � " + salario);

		double divisao = 3.14 / 2;
		System.out.println(divisao);

		// int valor = 12.5; // n�o compila
		// int valor2 = 0.0; // n�o compila
		// double teste = 125.50; // compila
		// int valor3 = teste; // n�o compila

		int divisaoInteira = 5 / 2;
		System.out.println(divisaoInteira); // sa�da = 2
		
		double divisaoPontoFlutuante = 5.0 / 2;
		System.out.println(divisaoPontoFlutuante); // sa�da = 2.5
		
	}
}
