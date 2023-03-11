package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class NTermosSoma {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor de N: ");
		int n = scan.nextInt();
		double soma = 0;
		
		for (int i = 1, j = 1; i <= n; i++, j = j+2) {
			
			System.out.print(i + "/" + j + " + ");
			
			soma = soma + i/j;
		}
		
		System.out.println("\nSoma = " + soma);
	}

}
