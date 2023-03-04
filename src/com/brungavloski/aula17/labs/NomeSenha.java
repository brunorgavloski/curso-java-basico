package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class NomeSenha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		boolean infoValidas = false;
		String nomeUser;
		String senhaDigitada;
		
		do {
			
			System.out.println("Digite seu nome: ");
			String nomeUser = scan.next();
			
			System.out.println("Digite sua senha: ");
			String senhaDigitada = scan.next();
			
			if (senhaDigitada.equalsIgnoreCase(nomeUser)) {
				
				System.out.println("Senha igual ao user ");
			} else {
				System.out.println("Senha diferente portanto OK ");
				infoValidas = true;
			}
				
				
		} while (!infoValidas);		

	}

}
