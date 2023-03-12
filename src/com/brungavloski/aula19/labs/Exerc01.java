package com.brungavloski.aula19.labs;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valorIndice = 0;
		int[] a = new int[5];
		int[] b = new int[5];

		for (int i = 0; i < a.length; i++) {
			
			System.out.println("Digite o valor do indice " + (i+1) + ": ");
			valorIndice = scan.nextInt();
			
			a[i] = valorIndice;
			b[i] = valorIndice;
			
		}
		System.out.print("Vetor A: ");
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] +" ");
			
		}
		System.out.println("");
		System.out.print("Vetor B: ");
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(b[i] +" ");
			
		}
		


			
		}
		
		
	}


