package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Digite a nota 1: ");
		float nota1 = scan.nextFloat();
		System.out.println("Digite a nota 2: ");
		float nota2 = scan.nextFloat();
		
		float media = ((nota1 + nota2)/2); 
		
		if(media == 10) {
			System.out.println("Tirou 10");
		} else if (media <= 7) {
			System.out.println("Reprovado.");
		} else if(media >= 7){
			System.out.println("Na media");
		} else {
			
		}
	}

}
