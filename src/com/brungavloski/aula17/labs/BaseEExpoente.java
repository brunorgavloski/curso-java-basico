package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class BaseEExpoente {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int base, pot;
		int result = 0;
		
		System.out.println("Digite o número da base: ");
		base = scan.nextInt();
		
		System.out.println("Digite o número da base: ");
		pot = scan.nextInt();
		
		int resultado = base;
		
		for (int i=0; i<pot; i++) {
			result *= base;
		}
		System.out.println("Resultado é: " + result);
		
	}

}
