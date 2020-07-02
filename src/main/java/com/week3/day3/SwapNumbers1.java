package com.week3.day3;

public class SwapNumbers1 {
	
//	Write a java program to swap two numbers  
//	Input: a = 5, b= 10  
//	output: a = 10, b = 5  
//	(Note: Try without the third variable)

	public static void main(String[] args) {
		int a=20, b=10;
		int c;
		a+=b;
		b=a-b;
		a-=b;
//		c=a;
//		a=b;
//		b=c;
		System.out.println("After swapping a= "+a+" b="+b);
	}

}
