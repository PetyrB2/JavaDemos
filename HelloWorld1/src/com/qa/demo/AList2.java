package com.qa.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AList2 {

	public static void main(String[] args) {
		List<Integer> faveNums = new ArrayList<>();

		faveNums.add(10);
		faveNums.add(1355417);
		faveNums.add(63);
		faveNums.add(2342);
		faveNums.add(23423);
		faveNums.add(453);
		faveNums.add(131);
		faveNums.add(123123);
		faveNums.add(1312);
		
		 Collections.reverse(faveNums);
		 
		 
		for (int i : faveNums) {
			System.out.println(i);
		}
	}
}