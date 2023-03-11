package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class CardapioLanchonete {

	public static void main(String[] args) {
		boolean fim = false;
		int pedido = 0;
		double fatura = 0;
		double faturaT = 0;
		int quantidade = 0;
		double cQ = 1.20;
		double bS = 1.30;
		double bO = 1.50;
		double ha = 1.20;
		double cb = 1.30;
		double re = 1.00;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.println("Especificação 		Código      Preço  ");
		System.out.println("Cachorro Quente		100	   R$ 1.20");
		System.out.println("Bauru Simples		101	   R$ 1.30");
		System.out.println("Bauru com ovo		102	   R$ 1.50");
		System.out.println("Hamburguer		103	   R$ 1.20");
		System.out.println("Cheeseburguer		104   	   R$ 1.30");
		System.out.println("Refrigerante		105	   R$ 1.00");
		System.out.println("------------------------------------------");
		
		
		do {
			System.out.println("Digite o codido do pedido: ");
			System.out.println("ENCERRAR - 0");
			pedido = scan.nextInt();
			
			if (pedido != 0) {
				
				if (pedido == 100) {
					System.out.println("Cachorro Quente - Quantas unidades: ");
					quantidade = scan.nextInt();
					fatura = cQ * quantidade;
				} else if (pedido == 101) {
					System.out.println("Bauru Simples - Quantas unidades: ");
					quantidade = scan.nextInt();
					fatura = bS * quantidade;
				} else if (pedido == 102) {
					System.out.println("Bauru com ovos - Quantas unidades: ");
					quantidade = scan.nextInt();
					fatura = bO * quantidade;
				} else if (pedido == 103 ) {
					System.out.println("Hamburguer: - Quantas unidades: ");
					quantidade = scan.nextInt();
					fatura = ha * quantidade;
				} else if (pedido == 104) {
					System.out.println("Cheeseburguer: - Quantas unidades: ");
					quantidade = scan.nextInt();
					fatura = cb * quantidade;
				} else if (pedido == 105) {
					System.out.println("Refrigerante: - Quantas unidades: ");
					quantidade = scan.nextInt();
					fatura = re * quantidade;
				} else {
					System.out.println("Codigo invalido!");
				}
				
				faturaT = fatura;
			} else {
				fim = true;
			}		
			
		} while(!fim);
		
		System.out.println("Fimd a compra. o valor da compra: R$" + faturaT);
	}

}
