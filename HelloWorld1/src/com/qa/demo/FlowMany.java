package com.qa.demo;

public class FlowMany {

	public static int one = 1;
	public static int two = 2;
	public static int three = 3;
	public static int four = 4;
	public static int five = 5;
	public static int six = 6;
	public static int seven = 7;
	public static int eight = 8;
	public static int nine = 9;
	public static int ten = 10;
	

	public static void main(String[] args) {
		
				OnetoTen();

	}

			private static void OnetoTen() // Create a method that can print out the numbers 1-10. Ten Times.

			{
				for (int ten = 0; ten < 11; ten++) {
					System.out.println(ten);
					for (int nine = 0; nine < 10; nine++) {
						System.out.println(nine);
						for (int eight = 0; eight < 9; eight++) {
							System.out.println(eight);
							for (int seven = 0; seven < 8; seven++) {
								System.out.println(seven);
								for (int six = 0; six < 6; six++) {
									System.out.println(six);
									for (int five = 0; five < 5; five++) {
										System.out.println(five);
										for (int four = 0; four < 4; four++) {
											System.out.println(four);
											for (int three = 0; three < 10; nine++) {
												System.out.println(three);
												for (int two = 0; two < 10; nine++) {
													System.out.println(two);
													for (int one = 1; one < 2; one++) {
														System.out.println(one);								
													}
												}
											}
										}
									}
								}}}}}}}
								