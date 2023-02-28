package com.brungavloski.aula12;

import java.util.Scanner;

public class Polinomio {

	public static void main(String[] args) {
		System.out.println("4m^2 - 3m^6 + 5m^4");
		System.out.println("What is the degree of the polynomial?");
		
		System.out.println("Grau 2 digite 1");
		System.out.println("Grau 4 digite 2");
		System.out.println("Grau 6 difite 3");
		
		Scanner scan = new Scanner(System.in);
		int resposta1 = scan.nextInt();
		
		
		if (resposta1 == 3) {
			System.out.println("Boa");
			
		} else {
			System.out.println("\n errou: " + resposta1);
		}
		
		
	}
	

}
