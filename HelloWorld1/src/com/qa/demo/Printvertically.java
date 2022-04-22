package com.qa.demo;

public class Printvertically {

	
	
	public String str1;
	
	public static void main(String[] args) {
		
		
			String str1 = "Hello World";

			
	
		
		for(int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) != ' ')
				
				System.out.println(str1.charAt(i));
		}
		}
}
