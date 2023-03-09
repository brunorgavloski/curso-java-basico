package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class NumeroPrimosEntre1EEntradaDoUser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numero = 0;
		
		System.out.println("Digite o numero final");
		numero = scan.nextInt();
		
		for (int i=1; i<numero; i++) {
			System.out.println(i);
			boolean primo = true;
			
			for (int j=2; j<i; j++) {
				if (i % j == 0) {
					primo = false;
					System.out.println("falso" + j);
				}
			}
			
			if (primo) {
				System.out.println("É primo");
			}
			
		}
		
	}

}
