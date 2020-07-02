package com.testleaf.week1;

public class Occurence1 {

	public static void main(String[] args) {
		String input = "You have no choice other than following me!";
		char[] charArray = input.toCharArray();
		int count=0;
		for (int i=0; i<charArray.length; i++) {
			if (charArray[i]=='o') {
				count++;
			}
		}
		System.out.println("Occurence of character 'o' in the given string is "+count+ " times");
	}

}
