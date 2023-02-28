package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class MiniCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		 double primeiroNumero = scan.nextDouble();
		System.out.println("Digite o segundo número: ");
		double segundoNumero = scan.nextDouble();
		
		System.out.println("Digite qual operação");
		System.out.println("Soma 		  1");
		System.out.println("multiplicação     2");
		System.out.println("Subtração 	  3");
		System.out.println("Divisão		  4");
		
		int operacao = scan.nextInt();
		double resultado = 0;
		switch(operacao){
		case 1: resultado = primeiroNumero + segundoNumero; break;
		case 2: resultado = primeiroNumero * segundoNumero; break;
		case 3: resultado = primeiroNumero - segundoNumero; break;
		case 4: resultado = primeiroNumero / segundoNumero; break;
		default: System.out.println("Invalido!");
		}
		
			System.out.println("O resultado é: " + resultado);
		
		if(resultado % 2 == 0 ) {
			System.out.println("O resultado é par " );
		} else {
			System.out.println("O resultado é impar " );
		}
		
		if(resultado > 0) {
			System.out.println("O resultado é positivo " );
		} else {
			System.out.println("O resultado é negativo " );
		}
		
		
		

	}
}