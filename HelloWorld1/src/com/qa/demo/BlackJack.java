
package com.qa.demo;

import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		
		while (true) {
			int closer = blackJack(Integer.parseInt(getInput("Number 1: ")), Integer.parseInt(getInput("Number 2: ")));
			System.out.println(closer + "\n");
		}
	}

	public static int blackJack(int num1, int num2) {
		int closest = 0;
		if (num1 > 21 && num2 <= 21) {
			return num2;
		} else if (num1 <= 21 && num2 > 21) {
			return num1;
		} else if (num1 <= 21 && num2 <= 21) {
			int diff1 = 21 - num1;
			int diff2 = 21 - num2;
			if (diff1 > diff2) {
				return num2;
			} else {
				return num1;
			}
		}
		return closest;
	}

//	public static String getInput(String message) {
//// Initialise scanner object
//		Scanner input = new Scanner(System.in);
//		System.out.print(message);
//		return input.nextLine();
//	}
//}
