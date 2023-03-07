 package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class NPessoasDigitamAIdadeAvaliaIdade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int quantidade = 0;
		int idade = 0;
		double soma = 0;
		System.out.println("Digite a quantidade de pessoas: ");
		quantidade = scan.nextInt();
		
		for (int i = 1; i <= quantidade; i++) {
			System.out.println("Digite a idade " + i + ": ");
			idade = scan.nextInt();
			soma += idade;
		}
		
		double resultado = soma/quantidade;
		
		if (resultado > 0 && resultado <= 25) {
			System.out.println("Jovens");
		} else if (resultado >= 26 && resultado <= 60) {
			System.out.println("Adultos");
		} else if (resultado > 60) {
			System.out.println("3º idade");
		}
		
	}

}
