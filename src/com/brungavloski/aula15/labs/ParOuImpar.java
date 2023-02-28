package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro e descubra se é par ou impar: ");
		int duvida = scan.nextInt();
		
		if(duvida % 2 == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número impar.");
		}
	}

}
