package com.qa.demo;

public class TenTimes {

	public static boolean count = true;

	public static void main(String[] args) {

		OnetoTen();

	}

	private static void OnetoTen() // Create a method that can print out the numbers 1-10. Ten Times.

	{
		for (int i = 0; i < 10; i++) {
			for (int i2 = 0; i2 < 10; i2++) {
				System.out.println(i2 + 1);
			}
			
			
// int i2 = 0;
//		do {
//			System.out.println(i);
//			
//		
//			if(i > 10 ) {
//				i2++;
//				System.out.println("Round: " + i2);
//			}
//		} while (i2 < 10);

			
			
		}
	}
}