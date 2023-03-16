package com.brungavloski.aula19.labs;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int caunt = 0;
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor para o indice " + i + " :");
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i] % 5 == 0) {
				caunt += vetorA[i];
			}
		}
		
		System.out.print("VetorA: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
		}
		
		System.out.println("A soma do vetor é: " + caunt);
		
	}

}
