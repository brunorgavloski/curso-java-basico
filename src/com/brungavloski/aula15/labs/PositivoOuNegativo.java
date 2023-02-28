package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class PositivoOuNegativo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma valor e descubra se é positivo ou negativo");
		
		int valor = scan.nextInt();
		
		if(valor > 0) {
			System.out.println("Valor é positivo;");
		} else {
			System.out.println("Valor é neativo;");
		}
	}

}
