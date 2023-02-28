package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class VogalOuConsoanteEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra e teste se é vogal ou consoante: ");
		String resposta = scan.next();
		
		/*
		if(resposta.equalsIgnoreCase("a")) {
			System.out.println("Sua letra é vogal: " + resposta);
			
		} else if (resposta.equalsIgnoreCase("e")) {
			System.out.println("Sua letra é vogal: " + resposta);
			
		} else if (resposta.equalsIgnoreCase("i")) {
			System.out.println("Sua letra é vogal: " + resposta);
			
		} else if (resposta.equalsIgnoreCase("o")) {
			System.out.println("Sua letra é vogal: " + resposta);
			
		} else if (resposta.equalsIgnoreCase("u")) {
			System.out.println("Sua letra é vogal: " + resposta);
			
		} else {
			System.out.println("Sua letra é consoante: " + resposta);
		} */
		
		if(resposta.length() > 1) {
			System.out.println("não é valido mas de uma letra. ");
		} else {
		switch(resposta) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U": System.out.println("Sua letra é vogal: " + resposta);break;
		default: System.out.println("Sua letra é consoante: " + resposta);
		}
	   }
	}

}
