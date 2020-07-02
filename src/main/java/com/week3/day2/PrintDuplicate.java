package com.week3.day2;

public class PrintDuplicate {
	
//	Write a java programs to print the duplicate items in the array  
//	int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};

	public static void main(String[] args) {
		int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
		
		for (int i=0; i < my_array.length; i++) {
			int count=0;
			for (int j=0; j < my_array.length; j++) {
				if ((my_array[i] == my_array[j]) && count==0 && (i!=j)) {
					count++;
					System.out.println(my_array[j]);
				}
			}
		}
	}

}
