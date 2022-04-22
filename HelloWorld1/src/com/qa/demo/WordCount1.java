package com.qa.demo;

public class WordCount1 {

	static int wordcount(String thesentence) {
		
		
		int count = 0;

		char countwords[] = new char[thesentence.length()];
		for (int i = 0; i < thesentence.length(); i++) {
			countwords[i] = thesentence.charAt(i);
			if (((i > 0) && (countwords[i] != ' ') && (countwords[i - 1] == ' ')) || ((countwords[0] != ' ') && (i == 0)))
				count++;
		}
		return count;
	}

	
	
	
	public static void main(String[] args) {
		
		// EDIT THIS STRING -- NEED TO LEARN HOW TO INPUT DATA using the import thing so can offer user input
		String thesentence = "Where in the world do you want to go?";
		
		
		
		
		System.out.println("The sentence:");
		System.out.println(thesentence.toUpperCase());
		System.out.println("has " + wordcount(thesentence) + " words.");
	}
}
