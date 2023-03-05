package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class PopulaçãoDeAbitantesPaisAB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean validar = false;
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		
		
		do {
			
			System.out.println("Entre opulação A; ");
			popA = scan.nextInt();
			
			if (popA > 0) {
				validar = true;
			} else {
				System.out.println("Pop precisa ser maior que zero.");
			}
			
		} while (!validar);
		
			validar = false;
		
		do {
			
			System.out.println("Entre opulação B; ");
			popB = scan.nextInt();
			
			if (popB > 0) {
				validar = true;
			} else {
				System.out.println("Pop B precisa ser maior que zero.");
			}
			
		} while (!validar);
		
		validar = false;
		
		do {
			
			System.out.println("Entre taxa A; ");
			taxaA = scan.nextDouble();
			
			if (taxaA > 0) {
				validar = true;
			} else {
				System.out.println("taxa B precisa ser maior que zero.");
			}
			
		} while (!validar);
		
		validar = false;
		
		do {
			
			System.out.println("Entre taxa B; ");
			taxaB = scan.nextDouble();
			
			if (taxaB > 0) {
				validar = true;
			} else {
				System.out.println("taxa B precisa ser maior que zero.");
			}
			
		} while (!validar);
		
		int cont = 0;
		
		
		while (popA < popB) {
			popA += (popA/100) * taxaA;
			popB += (popA/100) * taxaB;
			cont++;
		}
		
		System.out.println("População A;" + popA);
		System.out.println("População B;" + popB);
		System.out.println("Quantidade de anos: " + cont);
	}

}
