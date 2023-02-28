package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class LeDuasNotasDaDiscplinaCalcMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner media = new Scanner(System.in);
		
		System.out.println("Entre com a média 1:");
		double notaUm = media.nextDouble(); 
		System.out.println("Entre com a média 2:");
		double notaDois = media.nextDouble();
		
		double mdia = ((notaUm + notaUm)/2);
		
		System.out.println("Media de aproveitamento conceito");
		System.out.println("Nota 1: " + notaUm);
		System.out.println("Nota 2: " + notaDois);
		System.out.println("o média obtida foi: " + mdia);
		
		if(mdia >= 9 && mdia <= 10) {
			System.out.println("O conceito obtido foi: A");
			System.out.println("Aprovado");
		} else if (mdia >= 7.5 && mdia <= 9){
			System.out.println("O conceito obtido foi: B");
			System.out.println("Aprovado");
		} else if (mdia >= 6 && mdia <= 7.5) {
			System.out.println("O conceito obtido foi: C");
			System.out.println("Aprovado");
		} else if (mdia >= 4 && mdia <= 6) {
			System.out.println("O conceito obtido foi: D");
			System.out.println("Reprovado");
		} else if (mdia <= 4) {
			System.out.println("O conceito obtido foi: E");
			System.out.println("Reprovado");
		}
		
		
		
	}

}
