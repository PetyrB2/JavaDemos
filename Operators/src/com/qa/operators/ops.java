package com.qa.operators;

public class ops {
	
	public static void main(String[] args) {
		
		Addition(32, 78);
		Subtract(55, 32);
		Divide(100, 30000);
		Multiply(5, 7);
		
	}
		
	private static void Addition(int num1, int num2) {

		int add = num1 + num2;
		System.out.println(add);	
}
	
	private static void Divide(double num5, double num6) {

		if(num6 < num5) {
			System.out.println("Division cannot be performed. Please try again.");
		}
		else { 
			double division = num6 /num5;
			System.out.println(division);
			}
					
	}

		private static void Subtract( int num3, int num4) {
			

			int minus = num4 - num3;
			System.out.println(minus);	
	}




	private static void Multiply(int num7, int num8) {

		int multiply = num7 * num8;
		System.out.println(multiply);
		
	}

}
