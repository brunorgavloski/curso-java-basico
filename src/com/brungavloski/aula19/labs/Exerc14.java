package com.brungavloski.aula19.labs;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		int impar = 0;
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " +i+ ": " );
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				impar++;
			
			}
	
		}
		
		System.out.print("VetorA: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
		}
		
		System.out.println("A soma do vetor é: " + soma);
		System.out.println("A soma do vetor é: " + (soma/impar));
		
	}

}
