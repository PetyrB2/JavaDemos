package com.qa.results;

public class results2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method1(130,120,100);
		method2(130,120,100);
	}

//	 Method 1 Physics, Chem, Bio and Total	

	public static void method1(double phys, double chem, double bio) {

		double total = phys + chem + bio;
		System.out.println("------------------------------------------------------");
		System.out.println("			EXAM RESULTS");
		System.out.println("------------------------------------------------------");
		System.out.print("Physics:		");
		System.out.println(phys);
		System.out.println("------------------");
		System.out.print("Chemistry:		");
		System.out.println(chem);
		System.out.println("------------------");
		System.out.print("Biology:		");
		System.out.println(bio);
		System.out.println("------------------");
		System.out.print("Grand Total:		");
		System.out.println(total);
		System.out.println("------------------------------------------------------");

	}

//method 2 The Percentage below

	public static void method2(double phys, double chem, double bio) {

		double total = phys + chem + bio;
		double perc = (total * 100) / 450;
		System.out.print("Your Average Score was:  ");
		System.out.println(perc);
		System.out.println("------------------------------------------------------");	
	
	if ((perc) < 60) {
		System.out.println("		YOU FAILED!");
	}

	else {
		System.out.println("		YOU PASSED!");
	
	}
	}

}
