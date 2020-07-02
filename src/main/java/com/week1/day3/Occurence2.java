package com.week1.day3;

public class Occurence2 {

	public static void main(String[] args) {
		String input = "You have no choice other than following me!";
		int count=0;
		for (int i=0; i<input.length(); i++) {
			if(input.charAt(i)== 'o') {
				count++;
			}
		}
		System.out.println("Occurence of character 'o' in the given string is "+count+ " times");
	}

}
