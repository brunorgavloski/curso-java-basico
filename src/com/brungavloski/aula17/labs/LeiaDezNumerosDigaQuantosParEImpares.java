package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class LeiaDezNumerosDigaQuantosParEImpares {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		int par = 0;
		int impar = 0;
		
		for (int i = 1;i <= 10; i++) {
			System.out.println("Digite o numero: ");
			numero = scan.nextInt();
			
			if (numero % 2 == 0) {
				par = par + 1 ;
			} else {
				impar = impar + 1;
			}
			
		}
		
		System.out.println("A quantidade de nº par são: " + par);
		System.out.println("A quantidade de nº impar são: " + impar);
	}

}
