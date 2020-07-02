package com.week3.day1;

public class ArrayAverage2 {
	
//	Write a java program to find the average of the numbers in an arrray.
//	input: int[] array= {20, 30, 25, 35, -16, 60, -100};
//	output: Average: 7

	public static void main(String[] args) {
		int[] array= {20, 30, 25, 35, -16, 60, -100};
		int sum=0;
		
		for (int b: array) {
			sum += b;
		}
		
		System.out.println("Average is "+ (sum/array.length));
		
	}

}
