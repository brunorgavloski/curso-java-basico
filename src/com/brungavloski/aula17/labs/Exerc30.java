package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class Exerc30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int tabuada = 0;
		int valorInicial = 0;
		int valorFinal = 0;
		boolean invalido = false;
	
		System.out.println("Digite qual tabuada quer usa: ");
		tabuada = scan.nextInt();
	
		do {
		
			System.out.println("Digite valor inicial: ");
			valorInicial = scan.nextInt();
			
			System.out.println("Digite valor final: ");
			valorFinal = scan.nextInt();
		
			
			if (valorInicial > valorFinal) {
				invalido = true;
			}
			
			System.out.println("Vou montar a tabuada do " + tabuada +
					"comecando em " + valorInicial + "terminando" + valorFinal);
			
			for (int i = valorInicial; i <= valorFinal; i++) {
				System.out.println(tabuada + " x " + valorInicial + " = " + (tabuada*i));
			}
			
		
		} while(!invalido);
		
		
		
		
		
		
		
	}

}
