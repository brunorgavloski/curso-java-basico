package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class CalcularRaizEquacaoSegundoGrau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ax2 + bx + c
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem vindo ao cálculo da formula de baskara.");
		System.out.println("Digite o valor para (a).");
		int a = scan.nextInt();
		if(a == 0) {
			System.out.println("Encerra, não é equação de segundo grau.");
			
		} else {
			System.out.println("Digite o valor para (b).");
			int b = scan.nextInt();
			System.out.println("Digite o valor para (c).");
			int c = scan.nextInt();
			
			double delta = ((b*b)-4*a*c);
			
			if(delta < 0) {
				System.out.println("Delta negativo não possui raiz.");
			} else {
				System.out.println("Delta positivo: " + delta);
				
				double raiz = Math.sqrt(delta);
				double raizPositiva = ((-b + raiz) / 2*a);
				double raizNegativa = ((-b - raiz) / 2*a);
				
				System.out.println("Raiz positiva o valor é:" + raizPositiva);
				System.out.println("Raiz negativa o valor é:" + raizNegativa);
			}
			
		}
		
		
		
		
	}

}
