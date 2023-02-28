package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class PerguntaAnoBissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o ano para saber se é BISSEXTO: ");
		int ano = scan.nextInt();
		
		if(ano % 4 == 0 || ano % 400 == 0) {
			System.out.println("Ano BISSEXTO");
		} else {
			System.out.println("Ano não BISSEXTO.");
		}

	}

}
