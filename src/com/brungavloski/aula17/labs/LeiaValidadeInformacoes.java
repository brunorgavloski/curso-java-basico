package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class LeiaValidadeInformacoes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		boolean infoValidar = false;
		String nome, genero, estadoCivil;
		int idade;
		double salario;
		
		do {
			System.out.println("diga o seu nome: ");
			nome = scan.next();
			
			
			if (nome.length() > 3) {
				infoValidar = true;
			} else {
				System.out.println("Precisa ter mais que três caracteres.");
			}
		} while (!infoValidar);
		
		infoValidar = false;

		do {
			System.out.println("diga o sua idade: ");
			idade = scan.nextInt();
			
			if (idade >= 0 && idade <= 150) {
				infoValidar = true;
			} else {
				System.out.println("idade fora de intervalo.");
			}
		} while (!infoValidar);
		
		infoValidar = false;
		
		do {
			System.out.println("diga o seu salario: ");
			salario = scan.nextDouble();
			
			if (idade > 0) {
				infoValidar = true;
			} else {
				System.out.println("salario fora de intervalo.");
			}
		} while (!infoValidar);
		
infoValidar = false;
		
		do {
			System.out.println("Entre com o genero M ou F: ");
			genero = scan.next();
			
			if (genero.equalsIgnoreCase("M") || genero.equalsIgnoreCase("F") ) {
				infoValidar = true;
			} else {
				System.out.println("Sexo precisa ser 'M' ou F.");
			}
		} while (!infoValidar);
		
infoValidar = false;
		
		do {
			System.out.println("Estado civil S/C/V/D: ");
			estadoCivil = scan.next();
			
			if (estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C") || 
					estadoCivil.equalsIgnoreCase("V") ||	estadoCivil.equalsIgnoreCase("D")) {
				infoValidar = true;
			} else {
				System.out.println("Estado civil errado, repita.");
			}
		} while (!infoValidar);
		
		System.out.println("Nome: " + nome);
		System.out.println("Nome: " + idade);
		System.out.println("Nome: " + salario);
		System.out.println("Nome: " + genero);
		System.out.println("Nome: " + estadoCivil);
		
	}

}
