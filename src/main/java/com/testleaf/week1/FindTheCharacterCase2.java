package com.testleaf.week1;

public class FindTheCharacterCase2 {

	public static void main(String[] args) {
		String input = "1. It is Work from Home  not Work for Home";
		
		String[] split = input.split(" ");
		System.out.println("Total number of spaces = "+ (split.length-1)); //Number of spaces
		
		String upperCaseCount = input.replaceAll("[^A-Z]", "");
		String lowerCaseCount = input.replaceAll("[^a-z]", "");
		String numberCount = input.replaceAll("[^0-9]", "");
		
		System.out.println("Total number of UpperCase = "+ upperCaseCount.length());
		System.out.println("Total number of lowerCase = "+ lowerCaseCount.length());
		System.out.println("Total numbers = "+ numberCount.length());
//		System.out.println("Total spaces = "+ spaceCount);
//		System.out.println("Total number of special charactes = "+ (input.length()-((split.length-1)+upperCaseCount+lowerCaseCount+numberCount)));
	}

}
