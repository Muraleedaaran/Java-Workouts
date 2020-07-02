package com.testleaf.week1;

public class VerifyUserName1 {
	
//	Write a java program to validate the given username is valid or not
//	Input: "Balaji_1"
//	output: false
//	Input: "Testleaf$123"
//	output: false
//	Note: 
//	1. It should contain minimum 8 characters.
//	2. It allows alpha numeric characters and spl characters like . _ @ $

	public static void main(String[] args) {
		String input = "Balaji_1";
		
		
		if (input.length() >= 8) {
			if (input.matches("[^._@$]")) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
		}
		System.out.println("false");
	}

}
