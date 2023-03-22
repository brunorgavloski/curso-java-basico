package com.brungavloski.aula19.labs;

import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double dolar = 5;
		double dol = 0;
		double[]  valorDolares = new double[20];
		
		for (int i = 0; i < valorDolares.length; i++) {
			System.out.println("Digite o valor de real R$ " + (i+1) + " a ser convertido: ");
			dol = scan.nextDouble();
			
			valorDolares[i] = dol * dolar;
		}
		
		System.out.println();
		System.out.print("Vetor Dolares armazenados = ");
		for (int i = 0; i<valorDolares.length; i++) {
			System.out.print(valorDolares[i] + "U$  ");
		}
		
	}

}
