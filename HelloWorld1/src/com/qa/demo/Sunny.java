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

		// Concat
		String str3 = str1 + ", " + str2;
		System.out.println(str3);

		System.out.println(str3.toUpperCase());

		// SubString Method

		String mySubString1 = str2.substring(0, 11);
		String mySubString2 = str1.substring(16, 24);

		System.out.println(mySubString1.toUpperCase() + mySubString2.toUpperCase());

	}

}
