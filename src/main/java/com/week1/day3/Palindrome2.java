package com.week1.day3;

public class Palindrome2 {

	public static void main(String[] args) {
		String input = "maliayalam";
		StringBuilder sb = new StringBuilder(input);
		System.out.println((input.equalsIgnoreCase(sb.reverse().toString()) ?"Yes, Palindrome": "No, not a palindrome"));
		
	}

}
