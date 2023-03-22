package com.brungavloski.aula19.labs;

public class Exerc22 {

	public static void main(String[] args) {
		
		int[] aleatorios = new int[10];
		int  zero =0;
		int um = 0;
		for (int i = 0; i < aleatorios.length; i++ ) {
			aleatorios[i] = (int)Math.round(Math.random() * 1);
			
			if (aleatorios[i] == 1) {
				um++;
			} else if (aleatorios[i] == 0) {
				zero++;
			} else {
				System.out.println("Invalido");
			}
		}
		
		
		
		System.out.print("vator = ");
		for (int i = 0; i<aleatorios.length; i++) {
			System.out.print(aleatorios[i] + " ");
		}
	}

}
