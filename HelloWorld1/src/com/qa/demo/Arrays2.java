package com.qa.demo;

public class Arrays2 {

	public static void main(String[] args) {

		populate(Array);

	}

	static int[] Array = new int[10];

	private static void populate(int[] Array) {

			for (int i = 0; i < Array.length; i++) {
			Array[i] = i + 1;
			System.out.println(Array[i]);
			}
		}
}

