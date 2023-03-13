package com.brungavloski.aula19.labs;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Digite o valor do indice " + i + ": ");
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = Math.sqrt(vetorA[i]);
			
		}

		System.out.println();
		System.out.print("VetorA: ");
		for (int i = 0; i < vetorA.length; i++ ) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.print("VetorB: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		
	}

}
