package com.week2.day3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintMap3 {
	
//	Write a Java Program to print the keys and values from the Map  
//	map = {A=1, B=2, C=3, D=4, E=5}  
//	(Min 3 ways)  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'A';
		Map<Character, Integer> inputMap = new LinkedHashMap<Character, Integer>();
		
		for (int i=0; i<5; i++) {
			inputMap.put(a, (i+1));
			a++;
		}
		
		Iterator<Character> itr = inputMap.keySet().iterator();
		
		while (itr.hasNext()) {
			Character key = itr.next();
			System.out.println(key+"="+inputMap.get(key));
		}
	}

}
