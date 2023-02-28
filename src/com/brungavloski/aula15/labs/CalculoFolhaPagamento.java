package com.brungavloski.aula15.labs;

import java.util.Scanner;

public class CalculoFolhaPagamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem Vindo ao cálculo da folha de pagamento.");
		System.out.println("Informe o valor da sua hora: ");
		double valorHora = scan.nextDouble();
		System.out.println("Informe quantas horas trabalhou no mês: ");
		double quantidadeHora = scan.nextDouble();
		
		double salarioBruto = (valorHora * quantidadeHora);
		
		double fgts = 11;
		double inss = 10;
		double sindicato = 3;
		if(salarioBruto < 900.00) {
			double dscFgts = ((fgts/100)* salarioBruto);
			double dscInss = ((inss/100)* salarioBruto);
			double dscSindicato = ((sindicato/100)*salarioBruto);
			double totalDesc = dscSindicato + dscInss;
			double salaLiq = salarioBruto - totalDesc;
			System.out.println("Salário bruto do mês         :R$" + salarioBruto);
			System.out.println("(-) IR (isento)              : R$ 0.0");
			System.out.println("(-) INSS (10%)               : R$ " + dscInss);
			System.out.println("(-) FGTS (11%)               : R$ " + dscFgts);
			System.out.println("Quantidade de descontos      : R$ " + totalDesc);
			System.out.println("Sálario liquido              : R$ " + salaLiq);
			
		} else if(salarioBruto > 900.00 && salarioBruto < 1500.00) {
			double dscFgts = ((fgts/100)* salarioBruto);
			double dscInss = ((inss/100)* salarioBruto);
			double descImpostoRenda = (salarioBruto * 0.05);
			double dscSindicato = ((sindicato/100)*salarioBruto);
			double totalDesc = dscSindicato + dscInss;
			double salaLiq = salarioBruto - totalDesc;
			System.out.println("Salário bruto do mês        :R$" + salarioBruto);
			System.out.println("(-) IR (5%)                 : R$" + descImpostoRenda);
			System.out.println("(-) INSS (10%)              : R$ " + dscInss);
			System.out.println("(-) FGTS (11%)              : R$ " + dscFgts);;
			System.out.println("Quantidade de descontos     : R$ " + totalDesc);
			System.out.println("Sálario liquido             : R$ " + salaLiq);
		} else if(salarioBruto > 1500.00 && salarioBruto < 2500.00){
			double dscFgts = ((fgts/100)* salarioBruto);
			double dscInss = ((inss/100)* salarioBruto);
			double descImpostoRenda = (salarioBruto * 0.10);
			double dscSindicato = ((sindicato/100)*salarioBruto);
			double totalDesc = dscSindicato + dscInss;
			double salaLiq = salarioBruto - totalDesc;
			System.out.println("Salário bruto do mês        :R$" + salarioBruto);
			System.out.println("(-) IR (10%)                : R$" + descImpostoRenda);
			System.out.println("(-) INSS (10%)              : R$ " + dscInss);
			System.out.println("(-) FGTS (11%)              : R$ " + dscFgts);
			System.out.println("Quantidade de descontos     : R$ " + totalDesc);
			System.out.println("Sálario liquido             : R$ " + salaLiq);
		} else if(salarioBruto >= 2500.00) {
			double dscFgts = ((fgts/100)* salarioBruto);
			double dscInss = ((inss/100)* salarioBruto);
			double descImpostoRenda = (salarioBruto * 0.20);
			double dscSindicato = ((sindicato/100)*salarioBruto);
			double totalDesc = dscSindicato + dscInss;
			double salaLiq = salarioBruto - totalDesc;
			System.out.println("Salário bruto do mês        :R$" + salarioBruto);
			System.out.println("(-) IR (20%)                : R$ " + descImpostoRenda);
			System.out.println("(-) INSS (10%)              : R$ " + dscInss);
			System.out.println("(-) FGTS (11%)              : R$ " + dscFgts);
			System.out.println("Quantidade de descontos     : R$ " + totalDesc);
			System.out.println("Sálario liquido             : R$ " + salaLiq);
		}
		
		
	}

}
