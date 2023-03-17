package com.brungavloski.aula19.labs;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int caunt = 0;
		int[] vetorA = new int[10];

		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor de idade para o " + (i+1) + " :");
			vetorA[i] = scan.nextInt();

			if (vetorA[i] > 35) {
				caunt++;
			}
		}
		
		System.out.print("VetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
		}
		System.out.println();
		System.out.println("O número de pessoas com mais de 35 anos são: " + caunt);
		
	}

}
