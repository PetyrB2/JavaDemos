package com.qa.demo;

public class HelloWorld {

	public static void main(String[] args) {
//		 REMS Primitive Data Types - lower case

		boolean boolie = true;
		byte num1 = 1;
		char char1 = 'b';
		short num2 = 2;
		int num3 = 121212223;
		long num4 = 1234567834567L;
		float num5 = 3.12f;
		double num6 = 3.441223d;
		
		System.out.println(boolie);
		System.out.println(char1);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		
		System.out.println(withreturn());
	}
		
//		Not a Primitive Data Type
		public static String withreturn() {
			System.out.println("THIS IS A STRING !");
			return "Hello World!";
		}
	}
