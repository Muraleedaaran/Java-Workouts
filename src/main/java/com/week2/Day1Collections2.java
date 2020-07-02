package com.week2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Day1Collections2 {

//	Write a java program to print the duplicate character using Collections Framework.
//	Input: "When life gives you lemons, make lemonade"

	public static void main(String[] args) {
		
		String input = "When life gives you lemons, make lemonade";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < input.length(); i++) {
			if (map.get(input.charAt(i)) == null) {
				map.put(input.charAt(i), 1);
			} else {
				map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
			}
		}
		//System.out.println("Duplicate characters of the String are = ");
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1)
			{
				//System.out.print(entry.getKey() + " ");
			}
			System.out.println("Occurrence of " + entry.getKey() + " = " + entry.getValue());
		}
		
//		Integer i1 = null;
//		System.out.println(i1);
//		String s1 = null;
//		System.out.println(s1);
//		Map<String,String> mapTest = new HashMap<String, String>();
//		System.out.println(mapTest.get("Hello"));
//		mapTest.put("TestKey", "TestValue");
//		System.out.println(mapTest.get("TestKey"));
//		for (Map.Entry<String,String> entry : mapTest.entrySet()) {
//			System.out.print(entry.getKey() + " = " + entry.getValue());
//		}
	}

}
