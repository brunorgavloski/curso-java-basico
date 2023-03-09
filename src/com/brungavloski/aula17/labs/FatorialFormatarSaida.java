package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class FatorialFormatarSaida {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = scan.nextInt();
		
		System.out.println(num + "! = ");
		
		int fatorial = 1;
		for (int i=num; i>1 ; i--) {
			fatorial *= i;
			System.out.print(i + ".");
		}
		
		System.out.println(" 1 = " + fatorial);
		

	}

}
