package com.week2.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RetreiveValueFromSet1 {
	
//	How to retrieve a value from a Set?
//			Set = "1,2,3,4,5,6,7,8,9"
//			retrieve and print only the value - 7

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> inputSet = new HashSet<Integer>();
		
		for (int i=1;i<=9;i++) {
			inputSet.add(i);
		}
		
		List<Integer> inputList = new ArrayList<Integer>(inputSet);
		System.out.println(inputList.get(6));
		

	}

}
