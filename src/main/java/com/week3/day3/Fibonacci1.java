package com.week3.day3;

public class Fibonacci1 {

//	Print the first 10 fibonacci numbers in reverse order  
//	output: 34,21,13,8,5,3,2,1,1,0

	public static void main(String[] args) {
		int n = 10;

		int a = 1;
		int b = -1;
		int c = 0;
		for (int i = 0; i < n; i++) {
			c = a + b;
			System.out.print(c+" ");
			b = a;
			a = c;
		}
//		System.out.print(c+" ");
//		System.out.print(b+" ");

		System.out.println();
//		c = a + b;
//		b = a;
//		a = c;

		for (int i = n; i > 0; i--) {
			System.out.print(b+" ");
			c = a - b;
			a = b;
			b = c;

		}
	}

}
