package com.brungavloski.aula16;

import java.util.Scanner;

public class EquationLinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Linear Equation teste:");
		System.out.println("Type number one:");
		int numberOne = scan.nextInt();
		System.out.println("Type number two:");
		int numberTwo = scan.nextInt();
		
		for(int i = numberOne; i < numberTwo; i++) {
			int y = 2*i + 5;
			System.out.println(y);
		}
	}

}
