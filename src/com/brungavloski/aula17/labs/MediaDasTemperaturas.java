package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class MediaDasTemperaturas {

	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int qtdTemp = 0;
		int temp;
		double maior = Double.MAX_VALUE;
		double menor = Double.MIN_VALUE;
		
		
		System.out.println("Entre com a quantidade de temperaturas: ");
		qtdTemp = scan.nextInt();
		
		for (int i = 0; i < qtdTemp; i++) {
			System.out.println("Informa temperatura: " + i);
			temp = scan.nextInt();
			
			if (temp > maior) 
				maior = temp;
			
			
			if (temp < menor) 
				menor = temp;
			
			//System.out.println("O valor maior é: " + temp);		
		}
		
		System.out.println("O valor maior é: " + maior);
		System.out.println("O valor maior é: " + menor);
		
	}

}
