package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class LeiaTresNumerosMostreEmDescrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type the number one: ");
		double numberOne = scan.nextDouble();
		System.out.println("Type the number Two: ");
		double numberTwo = scan.nextDouble();
		System.out.println("Type the number three: ");
		double numberThree = scan.nextDouble();
		
		if(numberOne < numberTwo && numberOne < numberThree && numberTwo < numberThree) {
			System.out.println(numberThree + " - " + numberTwo + " - " + numberOne);
			
		} else if (numberOne < numberTwo && numberOne < numberThree && numberThree < numberTwo) {
			System.out.println(numberTwo + " - " + numberThree + " - " + numberOne);
		}
		
		
	}

}
