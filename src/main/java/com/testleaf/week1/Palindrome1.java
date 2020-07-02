package com.testleaf.week1;

public class Palindrome1 {

	public static void main(String[] args) {
		String input = "testleaf";
		String reverseInput = "";
		for (int i=input.length()-1; i>=0; i--) {
			reverseInput = reverseInput+input.charAt(i);
		}
		 System.out.println((input.equalsIgnoreCase(reverseInput) ?"Yes, Palindrome": "No, not a palindrome"));
		
	}

}
