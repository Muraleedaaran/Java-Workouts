package com.week2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.management.ImmutableDescriptor;

public class Day1PrintList1 {
	
//	Write a java program to print the list (Need 3 different answers)
//	Input: [B,u,g,a,t,t,i, ,C,h,i,r,o,n]

	public static void main(String[] args) {
		Character[] input = {'B','u','g','a','t','t','i',' ','C','h','i','r','o','n'};
		List<Character> listInput = Arrays.asList(input);

		for (Character eachChar: listInput) {
			System.out.print(eachChar+ " ");
		}
	}

}
