package com.qa.demo;

public class Flow {

	public static void main(String[] args) {
		flow(20, 2000, true);
	}

	private static void flow(int num1, int num2, boolean bool1) {
		// Boolean and 2 Integers

		if (bool1 == false) {
			System.out.println(num1+num2);
			}
		else {
			System.out.println(num1*num2);
		}
}
}

///DOESN'T WORK PROPERLY !'