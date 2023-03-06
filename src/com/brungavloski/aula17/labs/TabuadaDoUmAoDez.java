package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class TabuadaDoUmAoDez {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int tabu = 0;
		
		System.out.println("Digite qual tabuada quer acessar: 1 a 10 ");
		tabu = scan.nextInt();
		
		if (tabu > 0 && tabu < 10) {
			for (int i = 1; i <=10; i++) {
				System.out.println(tabu + " X " +i+ " = " + tabu * i);
			}
		} else {
			System.out.println("Fora do escope!!!");
		}
		

	}

}
