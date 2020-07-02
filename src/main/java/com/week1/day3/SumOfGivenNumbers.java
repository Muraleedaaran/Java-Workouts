package com.week1.day3;

public class SumOfGivenNumbers {

	public static void main(String[] args) {
		String input ="asdf1qwer9as8d7";
		String numberInput = input.replaceAll("[^0-9]", "");
		int sum=0;
		for (int i=0; i<numberInput.length();i++) {
			sum += Integer.parseInt(String.valueOf(numberInput.charAt(i)));
		}
		System.out.println("1+9+8+7 = "+sum);
	}

}
