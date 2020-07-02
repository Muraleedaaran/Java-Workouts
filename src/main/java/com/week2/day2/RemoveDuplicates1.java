package com.week2.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates1 {
	
	/*
	 * How to remove duplicates from a list? 
	 * List = "A,B,C,D,A,D,E,F"
	 */

	public static void main(String[] args) {
		Character[] input = {'A','B','C','D','A','D','E','F'};
//		List<Character> arrayList = Arrays.asList(input);
		List<Character> arrayList = new ArrayList<Character>();
		for (Character eachChar: input) {
			if(!arrayList.contains(eachChar)) {
			arrayList.add(eachChar);
			}
			
		}
		for (Character eachChar: arrayList) {
		System.out.println(eachChar);
		}
	}

}
