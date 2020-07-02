package com.week2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Day1PrintList2 {
	
//	Write a java program to print the list (Need 3 different answers)
//	Input: [B,u,g,a,t,t,i, ,C,h,i,r,o,n]

	public static void main(String[] args) {
		Character[] input = {'B','u','g','a','t','t','i',' ','C','h','i','r','o','n'};
		List<Character> listInput = Arrays.asList(input);
		
		Iterator<Character> itr = listInput.iterator();
		
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
