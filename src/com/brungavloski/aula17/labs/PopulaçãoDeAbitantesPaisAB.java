package com.brungavloski.aula17.labs;

public class PopulaçãoDeAbitantesPaisAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int popA = 80000;
		int popB = 200000;
		int cont = 0;
		
		while (popA < popB) {
			popA += (popA/100) * 3;
			popB += (popA/100) * 1.5;
			cont++;
		}
		
		System.out.println("População A;" + popA);
		System.out.println("População B;" + popB);
		System.out.println("Quantidade de anos: " + cont);
	}

}
