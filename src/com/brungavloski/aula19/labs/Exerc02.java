package com.brungavloski.aula19.labs;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[8];
		int[] b = new int[8];
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("Digite o valor para o índice: " + i + ": ");
			a[i] = scan.nextInt();
	
			b[i] = a[i]*2;
					
		}
		
		System.out.println();
		System.out.print("v[b] = ");
		for (int i = 0; i < a.length; i++ ) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		System.out.print("v[a] = ");
		
		for (int i = 0; i < b.length; i++ ) {
			System.out.print(+ b[i] + "  ");
		}
		
		

	}

}
