package com.brungavloski.aula19.labs;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
	
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor para o vetorA indice " +(i+1)+ ": ");
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i] % 2;
					
		}
	    
		System.out.println("");
		System.out.print("VetorA: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
		}
		
		System.out.println("");
		System.out.print("VetorB: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i]+ " ");
		}
		
		

	}

}
