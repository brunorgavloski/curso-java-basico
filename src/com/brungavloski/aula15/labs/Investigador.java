package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class Investigador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem Vindo ao Software de investigação.");
		System.out.println("Responda as perguntas abaixo com V ou F");
		
	
			System.out.println("Telefonou para a vitima: ");
			String resp1 = scan.next();
			System.out.println("Esteve no local:" );
			String resp2 = scan.next();
			System.out.println("Mora perto da vitima: " );
			String resp3 = scan.next();
			System.out.println("Devia para a vitima: " );
			String resp4 = scan.next();
			System.out.println("Já trabalhou com a vitima: " );
			String resp5 = scan.next();
			
			int contadorV = 0;
			int contadorF = 0;
			if(resp1.equalsIgnoreCase("V")) {
				contadorV++;
			} else {
				contadorF++;
			}
			if(resp2.equalsIgnoreCase("V")) {
				contadorV++;
			} else {
				contadorF++;
			}
			if(resp3.equalsIgnoreCase("V")) {
				contadorV++;
			} else {
				contadorF++;
			}
			if(resp4.equalsIgnoreCase("V")) {
				contadorV++;
			} else {
				contadorF++;
			}
			if(resp5.equalsIgnoreCase("V")) {
				contadorV++;
			} else {
				contadorF++;
			}
			
			if(contadorV == 2) {
				System.out.println("Suspeito com: " + contadorV);
			} else if(contadorV>=3 && contadorV<=4) {
				System.out.println("Cumplice com: " + contadorV);
			} else if(contadorV == 5) {
				System.out.println("Assassino com: " + contadorV);
			} else {
				System.out.println("Inocente");
			}
			
		
		
		
	}

}
