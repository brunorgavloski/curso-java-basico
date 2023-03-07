package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class MediaAritimeticaDeNNotas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int notas = 0;
		System.out.println("Entre com o numero de notas: ");
		notas = scan.nextInt();
		double valorNota = 0;
		double valor = 0;
		double valorFinal = 0;
		
		for (int i = 1; i <= notas; i++) {
			System.out.println("Digite a nota: " + i);
			valor = scan.nextInt();
			valorNota = valorNota + valor;
			
			
		}
		
		valorFinal = valorNota / notas;
		System.out.println("A média de notas é: " +  valorFinal);

	}

}
