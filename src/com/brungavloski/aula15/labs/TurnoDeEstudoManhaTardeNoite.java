package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class TurnoDeEstudoManhaTardeNoite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual seu turno de estudo: ");
		System.out.println("Digite M para matutino: ");
		System.out.println("Digite V para vespertino: ");
		System.out.println("Digite N para noturno: ");
		
		String turno = scan.next();
		/*
		if(turno.equalsIgnoreCase("M")) {
			System.out.println("Bom dia.");
		} else if (turno.equalsIgnoreCase("V")){
			System.out.println("Boa tarde.");
		} else if (turno.equalsIgnoreCase("N")) {
			System.out.println("Boa noite.");
		} else {
			System.out.println("invalido");
		}
		*/
		
		switch(turno) {
		case "m":
		case "M": System.out.println("Bom dia."); break;
		case "v":
		case "V": System.out.println("Boa tarde."); break;
		case "n":
		case "N": System.out.println("Boa noite."); break;
		default: System.out.println("Invalido");
		}
		
	}

}
