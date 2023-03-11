package com.brungavloski.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AumentoSalario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double percentual = 1.5;
		double salario = 1000;
		
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		salario =  (salario/100) * percentual;
		
		for (int i = 1995; i <= 2020; i++) {
			
			percentual *= 2;
			
			salario +=  (salario/100) * percentual;
			System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");
		}
	}

}
