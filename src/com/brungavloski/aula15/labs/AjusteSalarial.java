package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class AjusteSalarial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário: ");
		double salario = scan.nextDouble();
		
		if(salario <= 280.00) {
			double salarioAjuste = (salario * 0.2 );
			double novoSalario = salario + salarioAjuste;
			System.out.println("Seu salário atual é: " + salario + "R$");
			System.out.println("A porcentagem aplicada foi de 20%.");
			System.out.println("Seu novo salário: " + novoSalario + "R$");
		} else if (salario >= 280.00 && salario <= 700.00) {
			double salarioAjuste = (salario * 0.15 );
			double novoSalario = salario + salarioAjuste;
			System.out.println("Seu salário atual é: " + salario + "R$");
			System.out.println("A porcentagem aplicada foi de 15%.");
			System.out.println("Seu novo salário: " + novoSalario + "R$");
		} else if (salario >= 700.00 && salario <= 1500.00){
			double salarioAjuste = (salario * 0.10 );
			double novoSalario = salario + salarioAjuste;
			System.out.println("Seu salário atual é: " + salario + "R$");
			System.out.println("A porcentagem aplicada foi de 10%.");
			System.out.println("Seu novo salário: " + novoSalario + "R$");
		} else {
			double salarioAjuste = (salario * 0.05 );
			double novoSalario = salario + salarioAjuste;
			System.out.println("Seu salário atual é: " + salario + "R$");
			System.out.println("A porcentagem aplicada foi de 5%.");
			System.out.println("Seu novo salário: " + novoSalario + "R$");
		}
		
	}

}
