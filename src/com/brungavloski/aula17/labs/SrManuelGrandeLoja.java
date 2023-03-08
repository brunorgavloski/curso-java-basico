package com.brungavloski.aula17.labs;

public class SrManuelGrandeLoja {

	public static void main(String[] args) {
		System.out.println("Loja Quase Dois - Tabela de preços.");
		
		double preco = 0;
		for (int i = 1; i <= 50; i++) {
			preco = preco + 1.99;
			System.out.println(i + " - R$ " + preco);
			
		}

	}

}
