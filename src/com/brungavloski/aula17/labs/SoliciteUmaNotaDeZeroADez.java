package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class SoliciteUmaNotaDeZeroADez {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		boolean notaValiada = false;
		
		do {
			System.out.println("Digite uma nota de entre 0 e 10: ");
			int nota = scan.nextInt();
			
			if (nota >= 0 && nota <= 10) {
				notaValiada = true;
				System.out.println("vc digitou a nota correta: " + nota);
			} else {
				notaValiada = false;
				System.out.println("vc digitou a nota invalida");
			}
		} while (!notaValiada);
	
		
		
		
		
		
	}

}
