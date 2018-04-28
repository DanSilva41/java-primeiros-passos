package com.danilo.alura.java.sintaxebasicaefluxo;

public class TestaConversao {

	public static void main(String[] args) {
		// double salario = 1270.50;
		// int valor = salario;

		double salario = 1270.50;
		int valor = (int) salario; // casting
		System.out.println("Casting: " + valor);

		long numeroGrande = 32432423523L;
		System.out.println("Número grande: " + numeroGrande);

		short valorPequeno = 2131;
		System.out.println("Valor pequeno: " + valorPequeno);

		byte b = 127;
		System.out.println("Menor: " + b);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1+valor2;
		System.out.println(total); // floating point
		
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);
	}
}
