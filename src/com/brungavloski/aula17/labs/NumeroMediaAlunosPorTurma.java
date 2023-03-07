package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class NumeroMediaAlunosPorTurma {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o numero de turmas: ");
		int numeroTurmas = scan.nextInt();	
		
		int numeroAlunos = 0;
		int soma = 0;
		boolean invalido = true;
		
		for (int i = 1; i<=numeroTurmas; i++) {
			
			invalido = true;
			do {
				System.out.println("Entre com o numero de alunos da turma " + i);
				numeroAlunos = scan.nextInt();
				
				if (numeroAlunos <= 40) {
					invalido = false;
				} else {
					System.out.println("Invalido");
				}
			} while (invalido);
			
			soma += numeroAlunos;
		}
		
		double media = soma / numeroTurmas;
		
		System.out.println("Media:" + media);
	}
}
