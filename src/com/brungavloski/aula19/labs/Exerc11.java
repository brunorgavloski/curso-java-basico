package com.brungavloski.aula19.labs;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int caunt = 0;
		for (int i = 0; i<vetorA.length; i++) {
			System.out.println("Digite valor indicie " + (i+1) + "do vetorA");
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i] % 2 == 0) {
				caunt++;
			} else {
				
			}
			
		}

		System.out.println("A quantidade de valores pares são: " + caunt);
		System.out.print("VetorA: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
		}
		
		
	
	}

}
