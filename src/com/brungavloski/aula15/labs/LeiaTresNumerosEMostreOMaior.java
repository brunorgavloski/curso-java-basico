package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class LeiaTresNumerosEMostreOMaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número 1: ");
		int numberOne = scan.nextInt();
		System.out.println("Digite o número 2: ");
		int numberTwo = scan.nextInt();
		System.out.println("Digite o número 3: ");
		int numberThree = scan.nextInt();
		
		if(numberOne > numberTwo && numberOne > numberThree) {
			System.out.println("O número 1 é o maior: " + numberOne );
		} else if (numberTwo > numberOne && numberTwo > numberThree ) {
			System.out.println("O número 2 é o maior: " + numberTwo);
		} else if (numberThree > numberOne && numberThree > numberTwo) {
			System.out.println("O número 3 é o maior: " + numberThree);
		}
		
		if(numberOne < numberTwo && numberOne < numberThree) {
			System.out.println("O número 1 é o menor: " + numberOne );
		} else if (numberTwo < numberOne && numberTwo < numberThree ) {
			System.out.println("O número 2 é o menor: " + numberTwo);
		} else if (numberThree < numberOne && numberThree < numberTwo) {
			System.out.println("O número 3 é o menor: " + numberThree);
		}
		
	}

}
