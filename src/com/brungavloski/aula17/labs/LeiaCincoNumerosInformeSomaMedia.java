package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class LeiaCincoNumerosInformeSomaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		int count = 0;
		int media = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite um número a soma: ");
			count = scan.nextInt();
			numero = numero + count;
			
		}
		
		soma = numero;
		media = soma/5;
		System.out.println("A soma é: " + soma);
		System.out.println("A media é: " + media);
		
		
	}

}
