package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class LeTresLadosTrianguloDizSeETrianguloEQual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o lado 1: ");
		int ladoUm = scan.nextInt();
		System.out.println("Digite o lado 2: ");
		int ladoDois = scan.nextInt();
		System.out.println("Digite o lado 3: ");
		int ladoTres = scan.nextInt();
	
		if(ladoUm == ladoDois && ladoUm == ladoTres
				&& ladoDois == ladoTres) {
			System.out.println("Triangulo equilatero.");
		} else if(ladoUm == ladoDois ||
				ladoUm == ladoTres || ladoDois == ladoTres) {
			System.out.println("Triangulo isoceles.");
		} else {
			System.out.println("Escaleno.");
		}
	}

}
