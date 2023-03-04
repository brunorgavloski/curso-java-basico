package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class SoliciteUmaNotaDeZeroADez {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			System.out.println("Digite a nota: ");
			double nota = scan.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Nota ok, dentro do range;");
			} else {
				System.out.println("Nota fora do range;");
			}
			
		} while (!notaValida);
	
	}

}
