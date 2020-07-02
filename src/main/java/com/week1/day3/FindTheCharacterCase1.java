package com.week1.day3;

public class FindTheCharacterCase1 {

	public static void main(String[] args) {
		String input = "1. It is Work from Home  not Work for Home";
		
//		String[] split = input.split(" ");
//		System.out.println("Total number of spaces = "+ (split.length-1)); //Number of spaces
		
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int numberCount = 0;
		int spaceCount = 0;
		
		for (int i=0; i<input.length(); i++) {
			if(Character.isUpperCase(input.charAt(i))) {
				upperCaseCount++;
			}
			if(Character.isLowerCase(input.charAt(i))) {
				lowerCaseCount++;
			}
			if(Character.isDigit(input.charAt(i))) {
				numberCount++;
			}
			if(Character.isSpaceChar(input.charAt(i))) {
				spaceCount++;
			}
			
		}
		System.out.println("Total number of UpperCase = "+ upperCaseCount);
		System.out.println("Total number of lowerCase = "+ lowerCaseCount);
		System.out.println("Total numbers = "+ numberCount);
		System.out.println("Total spaces = "+ spaceCount);
//		System.out.println("Total number of special charactes = "+ (input.length()-((split.length-1)+upperCaseCount+lowerCaseCount+numberCount)));
	}

}
