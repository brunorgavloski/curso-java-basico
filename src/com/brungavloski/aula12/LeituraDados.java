package com.brungavloski.aula12;

import java.util.Scanner;

public class LeituraDados {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String nome = scan.next();
		System.out.println("Seu primeiro nome é: " + nome);
	}

}
