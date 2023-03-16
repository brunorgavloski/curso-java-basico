package com.brungavloski.aula19.labs;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		double porcentagemP = 0;
		double porcentagemN = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " +(i+1)+ ": " );
			vetorA[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			
			if (vetorA[i] % 2 == 0) {
				porcentagemP++;
			} else {
				porcentagemN++;
			}
		}
		
		double finalP = (porcentagemP/100)*100;
		double finalN = (porcentagemN/100)*100;
		System.out.println("positivo: " + finalP);
		System.out.println("positivo: " + finalN);
	}

}
