package com.week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayNumberMatch2 {
	
//	Write a java program to print the common numbers in between the two arrays.
//	int[] array1 = { 1, 2, 5, 5, 8, 9, 7, 10 };
//	int[] array2 = { 1, 0, 6, 15, 6, 4, 7, 0 };

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 5, 5, 15, 9, 7, 10 };
		int[] arr2 = { 1, 0, 6, 15, 6, 4, 7, 0 };
		Set<Integer> commonArr = new LinkedHashSet<Integer>();
		System.out.println("The common numbers in between the arrays are ");
		for (int i=0; i < arr1.length; i++) {
			for (int j=0; j< arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					commonArr.add(arr2[j]);
				}
			}
		}
		for (int c: commonArr) {
			System.out.println(c);
		}
	}

}
