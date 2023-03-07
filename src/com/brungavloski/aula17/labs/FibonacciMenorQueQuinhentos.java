package com.brungavloski.aula17.labs;

public class FibonacciMenorQueQuinhentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fibonacci até 500");
		boolean teste = false;
		int primeiro = 1;
		int segundo =1;
		int proximo = 0;
		do {
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			
			if (proximo > 500)
				teste =true;
			System.out.println(segundo);
		} while (!teste);
	}

}
