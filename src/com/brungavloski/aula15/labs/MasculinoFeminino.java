package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class MasculinoFeminino {

	 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual seu sexo? ");
		System.out.println("***************");
		System.out.println("*   Masculino *");
		System.out.println("*Digite      M*");
		System.out.println("*   Feminino  *");
		System.out.println("*Digite      F*");
		
		String resposta = scan.next();
		
		if (resposta.equalsIgnoreCase("M")) {
			System.out.println("*   Masculino *");
			
		} else if (resposta.equalsIgnoreCase("F")) {
			System.out.println("*   Feminino  *");
		} else {
			System.out.println("Invalido");
		}
		

	}

}
