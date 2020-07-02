package com.week2;

import java.util.Arrays;
import java.util.List;

public class Day1PrintList3 {

//	Write a java program to print the list (Need 3 different answers)
//	Input: [B,u,g,a,t,t,i, ,C,h,i,r,o,n]

	public static void main(String[] args) {
		Character[] input = {'B','u','g','a','t','t','i',' ','C','h','i','r','o','n'};
		List<Character> listInput = Arrays.asList(input);
		
		for (int i=0;i<listInput.size();i++) {
			System.out.print(listInput.get(i)+" ");
		}
		
	}

}
