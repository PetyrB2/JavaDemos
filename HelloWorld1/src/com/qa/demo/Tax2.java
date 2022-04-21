package com.qa.demo;

public class Tax2 {

	public static void main(String[] args) {
		

		taxbracket(6000);
		tax(45000.05);
	}

	private static void tax(double salary) {
		System.out.println("METHOD 2: The tax bracket and the amount you owe.");
		System.out.println("--------------------------------------------------");
		
		// Actual Tax Calculation to pay.
		if (salary < 14999) {
			System.out.println("You are in the 0% Tax rate & have to pay no Tax");
	}
		else if (salary < 19999) {
			System.out.println("You are in the 10% Tax rate");
			System.out.println("Your tax for the year is going to be ...�" + (salary/100) * 10);

		}
		else if (salary < 29999) {
			System.out.println("You are in the 15% Tax rate");
			System.out.println("Your tax for the year is going to be ...�" + (salary/100) * 15);
	}
		else if (salary < 44999) {
			System.out.println("You are in the 20% Tax rate");
			System.out.println("Your tax for the year is going to be ...�" + (salary/100) * 20);
	}
		else {
			System.out.println("You are in the 25% Tax rate");
			System.out.println("Your tax for the year on �" + salary + " is going to be ...�" + (salary/100) * 25);
	}
}	


	private static void taxbracket(double salary) {
		// Tax Bracket you  are in.
		
		System.out.println("METHOD 1: Your Tax Bracket");
		System.out.println("------------------------------");
	

		if (salary < 14999) {
				System.out.println("You are in the 0% Tax rate");
				System.out.println("------------------------------");
				System.out.println("------------------------------");
				System.out.println("                              ");
				}
			else if (salary < 19999) {
				System.out.println("You are in the 10% Tax rate");
				System.out.println("------------------------------");
				System.out.println("------------------------------");
				System.out.println("                              ");
				}
			else if (salary < 29999) {
				System.out.println("You are in the 15% Tax rate");
				System.out.println("------------------------------");
				System.out.println("------------------------------");
				System.out.println("                              ");
				}
			else if (salary < 44999) {
				System.out.println("You are in the 20% Tax rate");
				System.out.println("------------------------------");
				System.out.println("------------------------------");
				System.out.println("                              ");
				}
			else {
				System.out.println("You are in the 25% Tax rate");
				System.out.println("------------------------------");
				System.out.println("------------------------------");
				System.out.println("                              ");
				}
	}
	
	
	}