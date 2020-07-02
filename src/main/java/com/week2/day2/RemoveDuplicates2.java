package com.week2.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates2 {
	
	/*
	 * How to remove duplicates from a list? 
	 * List = "A,B,C,D,A,D,E,F"
	 */

	public static void main(String[] args) {
		Character[] input = {'A','B','C','D','A','D','E','F'};
		List<Character> arrayList = Arrays.asList(input);
		Set<Character> arraySet = new HashSet<Character>(arrayList);
		for (Character eachChar: arraySet) {
		System.out.println(eachChar);
		}
	}

}
