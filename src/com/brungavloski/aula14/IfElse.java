package com.brungavloski.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o preço do item: ");
		int valor = scan.nextInt();
		
		if(valor <= 10) {
		
		System.out.println("Pode comprar ta barato"  + valor + " reais");
		
		} else if (valor > 10 && valor < 15) {
			System.out.println("Pode pedir um desconto");
		} else if (valor > 15 && valor <17) {
			System.out.println("Pode pesquisar mais");
			
		} else {
			System.out.println("Muito caro");
		}
		
	}

}