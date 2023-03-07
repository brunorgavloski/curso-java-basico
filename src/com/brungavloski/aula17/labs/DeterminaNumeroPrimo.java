package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class DeterminaNumeroPrimo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		boolean primo = true;
		
		System.out.println("Digite um número e descubra se é primero: ");
		numero = scan.nextInt();
		
		for (int i=2; i<=numero; i++) {
			if (numero % i == 0) {
				System.out.println("Não é primero. Divisivel por" + i);
				primo = false;
				//break;
			} else {
				
			}
			
		}
		
		if (primo) {
			System.out.println("É primero.");
		}

	}

}
