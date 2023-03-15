package com.brungavloski.aula19.labs;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int caunt = 0;
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor do indice " +i+ ": ");
			vetorA[i] = scan.nextInt();
			caunt = caunt + vetorA[i];
			
		}
		
		//System.out.println("A quantidade de valores pares são: " + caunt);
		System.out.print("VetorA: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
		}
		
		System.out.println("A soma do vetor é: " + caunt);

	}

}
