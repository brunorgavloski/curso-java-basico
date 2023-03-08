package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class ValorInvestidoEmCDs {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int quantCds = 0;
		int valorCds = 0;
		int count = 0;
		int media = 0;
		int valorTotal = 0;
		
		System.out.println("Digite a quantidade de CDS que você possui: ");
		quantCds = scan.nextInt();
		
		for (int i = 1; i<=quantCds ; i++) {
			System.out.println("Digite o valor do CD " + i);
			valorCds = scan.nextInt();
			valorTotal = valorTotal + valorCds;
			count++;
			
		}
		media = (valorTotal / count);
		System.out.println("O valor total investido: " + valorTotal);
		System.out.println("A média é: " + media);
		

	}

}
