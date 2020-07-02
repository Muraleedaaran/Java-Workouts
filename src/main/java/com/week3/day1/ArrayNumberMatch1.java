package com.week3.day1;

public class ArrayNumberMatch1 {
	
//	Write a java program to print the common numbers in between the two arrays.
//	int[] array1 = { 1, 2, 5, 5, 8, 9, 7, 10 };
//	int[] array2 = { 1, 0, 6, 15, 6, 4, 7, 0 };

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int[] arr2 = { 1, 0, 6, 15, 6, 4, 7, 0 };
		System.out.println("The common numbers in between the arrays are ");
		for (int i=0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				System.out.println(arr1[i]);
			}
		}
	}

}
