package com.testleaf.week1;

import java.util.regex.Pattern;

public class EmailAddressValidation1 {
	
//	Write a java program to verify whether the given String is valid email address.
//	Input: "balaji.chandrasekaran@testleaf.com"
//	output: true
//	Input: "balaji.c@tunatap.co.uk"
//	output: true
//	Input: "naveen e@tl.com"
//	output: false
//	Note: Spl characters like . _ are only allowed

	public static void main(String[] args) {
		String input = "naveen e@tl.com";
		String regex = "^[A-Za-z0-9+_.]+@(.+)$";
//		String[] split = input.split("@");
		Pattern pattern = Pattern.compile(regex);
		System.out.println(pattern.matcher(input).matches());
	}

}
