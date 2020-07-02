package com.week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicate2 {
	
//	Write a java programs to print the duplicate items in the array  
//	int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};

	public static void main(String[] args) {
		int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
		Set<Integer> arraySet = new LinkedHashSet<Integer>();
		
		for (int i=0; i < my_array.length; i++) {
			if (!arraySet.add(my_array[i])) {
				System.out.println(my_array[i]);
			}
		}
	}

}
