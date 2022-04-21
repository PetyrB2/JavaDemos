package com.qa.demo;

public class Taxes {

	public static void main(String[] args) {
		

		taxbracket(6000);
	}

	private static void taxbracket(double salary) {
		
	

		if (salary < 14999) {
				System.out.println("You are in the 0% Tax rate");
		}
			else if (salary < 19999) {
				System.out.println("You are in the 10% Tax rate");
		}
			else if (salary < 29999) {
				System.out.println("You are in the 15% Tax rate");
		}
			else if (salary < 44999) {
				System.out.println("You are in the 20% Tax rate");
		}
			else {
				System.out.println("You are in the 25% Tax rate");
		}
	}
	
	
	}