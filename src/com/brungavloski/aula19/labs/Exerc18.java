package com.brungavloski.aula19.labs;

import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int caunt = 0;
		
		int[] idades = new int[10];

		for(int i = 0; i < idades.length; i++) {
			System.out.println("Entre com o valor de idade para o " + (i+1) + " :");
			idades[i] = scan.nextInt();
			
			
		}
		
		int menor = idades[0];
		int indexMenor = 0;
		int maior = idades[0];
		int indexMaior = idades[0];
		
		for (int i=1; i < idades.length; i++) {
			if(idades[i] > maior) {
				maior = idades[i];
				indexMaior = i;
			} else if (idades[i] < menor) {
				menor = idades[i];
				indexMenor = i;
			}
		}
		
		System.out.print("VetorA = ");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i]+ " ");
		}
		System.out.println();
		
		System.out.println("Menor idade: " + menor);
		System.out.println("Índice menor idade: " + indexMenor);
		System.out.println("Índice menor idade: " + maior);
		System.out.println("Índice menor idade: " + indexMaior);		
	}

}
