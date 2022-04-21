package com.qa.demo;

public class Sunny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Yesterday it was raining";
		System.out.println(str1);
		// Pumps out yesterday it was raining 
		String str2 = "today it is sunny.";
		System.out.println(str2);
		// Pumps out today it is sunny 
		
		String str3 = str1 + ", " + str2;
		System.out.println(str3);
		
		System.out.println(str3.toUpperCase());
	}

}
