package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class PedeDoisNumerosEImprimeOMaiorDeles {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois numeros: ");
		
		int numberOne = scan.nextInt();
		int numberTwo = scan.nextInt();

		boolean maior = (numberOne > numberTwo);
		
		if (maior ==  true) {
			System.out.println("é maior: " + numberOne);
		} else {
			System.out.println("Numero dois é maior: " + numberTwo);
		}

	}

}
