package com.brungavloski.aula19.labs;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int menorQuinze = 0;
		int igualQuinze = 0;
		int maiorQuinze = 0;
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor do indice para o vetorA " + (i+1) + " :");
			vetorA[i] = scan.nextInt();

		}
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] < 15) {
				menorQuinze += vetorA[i] ;	
			}
		
		 }
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] == 15) {
				igualQuinze++;	
			}
		
		 }
		int caunt = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] > 15) {
				maiorQuinze += vetorA[i];	
				caunt++;
			
			}
			
		 }
		int media = maiorQuinze/caunt;
		
		
		System.out.print("VetorA: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
		}
		
		System.out.println();
		System.out.println("VetorA < 15: " + menorQuinze);
		System.out.println("VetorA  == 15: " + igualQuinze);
		System.out.println("VetorA media maior que 15: " + media);

	}

}
