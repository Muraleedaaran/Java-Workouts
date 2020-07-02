package com.week3.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraySort1 {

//	Write a java program to sort it and reverse it.
//	Input: int[] array = {5,1,33,79,22,11,45};
//	output: 
//	Sorted: {1,5,11,22,33,45,79}
//	reversed: {79,45,33,22,11,5,1}
	
	public static void main(String[] args) {
		Integer[] arr = {5,1,33,79,22,11,45};
		Arrays.sort(arr);
		String string = Arrays.toString(arr);
		System.out.println(string);
		
		Comparator<Integer> comp = Collections.reverseOrder();
		Arrays.sort(arr, comp);
		System.out.println(Arrays.toString(arr));
	}

}
