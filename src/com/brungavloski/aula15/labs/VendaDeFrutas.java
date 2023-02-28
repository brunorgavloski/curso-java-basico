 package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class VendaDeFrutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade em (kg) de morango.");
		double qtdMorango = scan.nextDouble();
		System.out.println("Entre com a quantidade em (kg) de maca.");
		double qtdMaca = scan.nextDouble();
		
		double precokgMorango = 0;
		if (qtdMorango <= 5){
			precokgMorango = 2.5;
		} else {
			precokgMorango = 2.2;
		}
		
		double precokgMaca= 0;
		if (qtdMaca <= 5){
			precokgMaca = 2.5;
		} else {
			precokgMaca = 2.2;
		}
		
		double precoTotalMorango = qtdMorango * precokgMorango;
		double precoTotalMaca = qtdMaca * precokgMaca;
		
		double precoParcial = precokgMorango +  precokgMaca;
		double precoTotal = precoParcial;
		
		if ((qtdMorango + qtdMaca > 8) || precoParcial > 25) {
			precoTotal = precoParcial - ((precoParcial / 100) * 10);
		}
		
		System.out.println("Preco total =" + precoTotal);
	}

}
