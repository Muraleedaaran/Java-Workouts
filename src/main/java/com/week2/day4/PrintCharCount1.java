package com.week2.day4;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class PrintCharCount1 {
	
//	Write a java program to find the count the characters in the given string  
//	String str = "Karma is not as powerful as God"  
//	{K=1, a=3, r=2, m=1, =4, i=1, s=1, p=1, o=2, w=1, e=1, f=1, u=1, l=1, t=1, h=1, n=1, G=1, d=1}

	public static void main(String[] args) {
		String str = "Karma is not as powerful as God";
		Map<Character,Integer> strMap = new LinkedHashMap<Character,Integer>();
		
		for (int i=0;i<str.length();i++) {
			if (strMap.containsKey(str.charAt(i))) {
				strMap.put(str.charAt(i), strMap.get(str.charAt(i))+1);
			}
			else {
				strMap.put(str.charAt(i), 1);
			}
		}
		
		System.out.print(strMap);
	}

}
