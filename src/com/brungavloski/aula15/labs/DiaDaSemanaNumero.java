package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class DiaDaSemanaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número do dia: ");
		int diaSemana = scan.nextInt();
		
		switch(diaSemana) {
		case(1):System.out.println("Segunda Feira");break;
		case(2):System.out.println("Terça Feira");;break;
		case(3):System.out.println("Quarta Feira");;break;
		case(4):System.out.println("Quinta Feira");;break;
		case(5):System.out.println("Sexta Feira");;break;
		case(6):System.out.println("Sábado Feira");;break;
		case(7):System.out.println("Domingo Feira");;break;
		default:System.out.println("Número invalido.");;break;
		
		
		}
	}
}
