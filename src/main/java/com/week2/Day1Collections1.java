package com.week2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day1Collections1 {
	
//	Write a java program to print the duplicate character using Collections Framework.
//	Input: "When life gives you lemons, make lemonade"

	public static void main(String[] args) {
		String input = "When life gives you lemons, make lemonade";
		Set<Character> inputChar = new HashSet<Character>();
		Set<Character> repeatedChar = new HashSet<Character>();
		
		
		for (int i=0; i<input.length();i++) {
			
			if(!inputChar.add(input.charAt(i))) {
				repeatedChar.add(input.charAt(i));
			}

			}
		List<Character> repeatedList = new ArrayList<Character>(repeatedChar);
		for (Character eachChar:repeatedList) {
			System.out.println(eachChar);

		}
		
	}

}
