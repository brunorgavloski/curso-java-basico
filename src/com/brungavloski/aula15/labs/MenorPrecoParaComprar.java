package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class MenorPrecoParaComprar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto 1: ");
		float numberOne = scan.nextFloat();
		System.out.println("Digite o número 2: ");
		float numberTwo = scan.nextFloat();
		System.out.println("Digite o número 3: ");
		float numberThree = scan.nextFloat();
		
		if(numberOne < numberTwo && numberOne < numberThree) {
			System.out.println("O produtor 1 é o mais barato: " + numberOne + "R$");
		} else if (numberTwo < numberOne && numberTwo < numberThree ) {
			System.out.println("O produtor 2 é o mais barato: " + numberTwo + "R$");
		} else if (numberThree < numberOne && numberThree < numberTwo) {
			System.out.println("O produtor 3 é o mais barato: " + numberThree + "R$");
		}
	}

}
