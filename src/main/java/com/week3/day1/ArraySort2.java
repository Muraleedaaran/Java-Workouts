package com.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySort2 {

//	Write a java program to sort it and reverse it.
//	Input: int[] array = {5,1,33,79,22,11,45};
//	output: 
//	Sorted: {1,5,11,22,33,45,79}
//	reversed: {79,45,33,22,11,5,1}

	public static void main(String[] args) {
		int[] arr = { 5, 1, 33, 79, 22, 11, 45 };
		
		Arrays.sort(arr);
		
		for (int i=arr.length-1; i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
