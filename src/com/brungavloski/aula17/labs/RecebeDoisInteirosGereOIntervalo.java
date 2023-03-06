package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class RecebeDoisInteirosGereOIntervalo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int um = 0;
		int dois = 0;
		int count = 0;
		
		System.out.println("Digite o número inteiro 1: ");
		um = scan.nextInt();
		
		System.out.println("Digite o número inteiro 2: ");
		dois = scan.nextInt();
		
		if (um >= dois) {
			for (int i = dois; i<=um ; i++) {
				count += i;
				System.out.println("O numero do meio é: " + i);
				
			}
			
		} else if (dois >= um) {
			for (int i = um; i<=dois ; i++) {
				count += i;
				System.out.println("O numero do meio é: " + i);
			}
		}
		
		System.out.println("A some é: " + count);
	}

}
