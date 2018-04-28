package com.danilo.alura.java.sintaxebasicacondicionalloops;

public class TesteIR {

	public static void main(String[] args) {
		double salario = 3300.0;

		if (salario <= 1903.98) {
			System.out.println("Nenhuma alqíuota aplicada.");
		} else if (salario >= 1903.99 && salario <= 2826.65) {
			System.out.println("Alíquota a ser aplicade de 7.5%");
			System.out.println("Pode deduzir até R$142.80");
		} else if (salario >= 2826.66 && salario <= 3751.05) {
			System.out.println("Alíquota a ser aplicade de 15%");
			System.out.println("Pode deduzir até R$354.80");
		} else if (salario >= 3751.06 && salario <= 4664.68) {
			System.out.println("Alíquota a ser aplicade de 22.5%");
			System.out.println("Pode deduzir até R$636.13");
		} else if (salario > 4664.68) {
			System.out.println("Alíquota a ser aplicade de 27%");
			System.out.println("Pode deduzir até R$869.36");
		}
	}
}
