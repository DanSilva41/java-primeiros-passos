package com.danilo.alura.java.sintaxebasicaefluxo;

public class TestaValores {

	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		
		segundo = primeiro;
		primeiro = 10;
		System.out.println(segundo); // conteúdo da variável

	}
}
