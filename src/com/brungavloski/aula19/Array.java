package com.brungavloski.aula19;

public class Array {
	
	
	public static void sort(int[] a) {
		
	}
	
	public static void main(String[] args) {
		
		/*
		int[] x = new int[11];
		
		x[0] = 1;
		x[1] = 2;
		x[2] = 3;
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);

		*/
		
		double[] temperatura = new double[15];
		temperatura[0] = 30;
		temperatura[1] = 24;
		temperatura[2] = 25;
		temperatura[3] = 37;
		temperatura[4] = 36;
		temperatura[5] = 35;
		temperatura[6] = 28;
		temperatura[7] = 29;
		temperatura[8] = 30;
		temperatura[9] = 31;
		temperatura[10] = 32;
		temperatura[11] = 33;
		temperatura[12] = 34;
		temperatura[13] = 35;
		
		System.out.println(temperatura.length);
		System.out.println(temperatura);
		
		for (int i = 0; i < temperatura.length; i++) {
			
			System.out.println("a temp é:" + i+1 + "tempe" + temperatura[i] );
		}
		
		
	}
	
}
