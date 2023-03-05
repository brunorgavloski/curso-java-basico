package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class LeiaCincoNumerosEInformeOMaior {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 
		int count = 0;
		double numberOne = 0;
		double numberTwo = 0;
		double numberThree = 0;
		double numberFour = 0;
		double numberFive = 0;
		boolean maior = false;
		
		do {
			count++;
			System.out.println("Informe o numero 1: ");
			numberOne = scan.nextDouble();
			System.out.println("Informe o numero 2: ");
			numberTwo = scan.nextDouble();
			System.out.println("Informe o numero 3: ");
			numberThree = scan.nextDouble();
			System.out.println("Informe o numero 4: ");
			numberFour = scan.nextDouble();
			System.out.println("Informe o numero 5: ");
			numberFive = scan.nextDouble();
			
			if (numberOne > numberTwo && numberOne > numberThree &&
					numberOne > numberFour &&	numberOne > numberFive) {
				System.out.println("O maior numero é: " + numberOne);
			} else if (numberTwo > numberOne && numberTwo > numberThree &&
					numberTwo > numberFour && numberTwo > numberFive) {
				System.out.println("O maior numero é: " + numberTwo);
			} else if (numberThree > numberOne && numberThree > numberTwo && 
					numberThree > numberFour && numberThree > numberFive ) {
				System.out.println("O maior numero é: " + numberThree);
			} else if (numberFour > numberOne && numberFour > numberTwo &&
					numberFour > numberThree && numberFour > numberFive) {
				System.out.println("O maior numero é: " + numberFour);
			} else if (numberFive > numberOne && numberFive > numberTwo && numberFive > numberThree && numberFive > numberFour) {
				System.out.println("O maior numero é: " + numberFive);
			}
			maior = true;
		} while(!maior);
		*/
		
		int num;
		int maior = Integer.MIN_VALUE;
		
		for (int i = 0; i <5 ; i++) {
			System.out.println("Entre com um número: ");
			num = scan.nextInt();
			
			if (num > maior) {
				maior = num;
			}
		}
		
		System.out.println("O maior número digitado foi: " + maior);
		
	}
}
