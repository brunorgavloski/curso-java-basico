package com.brungavloski.aula19.labs;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] alunos = {1,2,3,5,6,7,8,9,10};
		
		double[] notasUm = new double[10];
		double[] notasDois = new double[notasUm.length];
		double[] resultados = new double[notasUm.length];
		
		for (int i = 0; i < notasUm.length; i++) {
			//notas 1
			System.out.println("Entre com a nota 1 do aluno" + (i+1));
			notasUm[i] = scan.nextDouble();
		
			System.out.println("Entre com a nota 2 do aluno" + (i+1));
			notasDois[i] = scan.nextDouble();
			
			resultados[i] = ((notasUm[i] + notasDois[i]) / 2);
		}
		
		System.out.print("Notas 1 = ");
		for (int i = 0; i<notasUm.length; i++) {
			System.out.print(notasUm[i] + " ");
		}
		System.out.println();
		
		System.out.print("Notas 2 = ");
		for (int i = 0; i<notasDois.length; i++) {
			System.out.print(notasDois[i] + " ");
		}
		System.out.println();
		
		System.out.println("Resultados: ");
		for (int i = 0; i<resultados.length; i++) {
			if (resultados[i] >= 7) {
				System.out.println(resultados[i] + " - Aprovado");
			} else {
				System.out.println(resultados[i] + " - Reprovado");
			}
		}
		
		

	}

}
