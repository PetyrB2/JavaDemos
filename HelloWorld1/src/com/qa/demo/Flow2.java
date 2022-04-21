package com.qa.demo;

public class Flow2 {

	public static void main(String[] args) {

		flow(100, true);

	}

	private static void flow(int i, boolean b) {
		// Flowchart1

		do {
			System.out.println(i);
			i++;

			if (i > 200) {
				b = false;
			}
		} while (b);

	}

}
