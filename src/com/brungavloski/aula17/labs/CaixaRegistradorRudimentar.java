package com.brungavloski.aula17.labs;

import java.util.Scanner;

public class CaixaRegistradorRudimentar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean diferenteZero = false;
		double valor = 0;
		double total = 0;
		double valorAPagar = 0;
		double troco = 0;
		
		System.out.println("#### Loja Tabajara ####");
		
		do {
			
			System.out.println("Qual o valor do produto: ");
			valor = scan.nextDouble();
			
			total = (total + valor);
			
			if (valor == 0) {
				diferenteZero = true;
				System.out.println("O valor total da compra foi: " + total);
				
				System.out.println("Digite o valor do pagamento: ");
				valorAPagar = scan.nextDouble();
								
				if (valorAPagar == total) {
					System.out.println("troco: R$ 0;");
				} else {
					troco =  valorAPagar - total;
					
					System.out.println("O valor do troco é: R$ " + troco);
				}
								
			} else {
				System.out.println("-> Valor proximo produto: ");
				System.out.println("-> Se finalizou a compra digite 0");
			}
		}
				
		while(!diferenteZero);

	}

}
