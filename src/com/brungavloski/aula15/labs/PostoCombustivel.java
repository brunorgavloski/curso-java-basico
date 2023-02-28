package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class PostoCombustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite A-álcool, G-gasolina: ");
		String tipoCombustivel = scan.next();
		System.out.println("Digite quantos litros quer abastecer: ");
		int quantidadeLitros = scan.nextInt();
		
		double valorGasolina = (quantidadeLitros * 2.50);
		double valorAlcool = (quantidadeLitros * 1.90);
		
		if(tipoCombustivel.equals("A")) {
			if(quantidadeLitros <= 20) {
				double desconto = (valorAlcool * 3 / 100);
				double valorFinal = (valorAlcool - desconto);
				System.out.println("O valor do alcool com desconto de 3% é:" + valorFinal);
			} else {
				double desconto = (valorAlcool * 5 / 100);
				double valorFinal = (valorAlcool - desconto);
				System.out.println("O valor do alcool com desconto de 5% é: " + valorFinal);
			}
			
		} else if (tipoCombustivel.equals("G")) {
			if(quantidadeLitros <= 20) {
				double desconto = (valorGasolina * 4 / 100);
				double valorFinal = (valorGasolina - desconto);
				System.out.println("O valor do alcool com desconto de 3% é:" + valorFinal);
			} else {
				double desconto = (valorGasolina * 6 / 100);
				double valorFinal = (valorGasolina - desconto);
				System.out.println("O valor do alcool com desconto de 5% é: " + valorFinal);
			}
		}
		
	}

}
