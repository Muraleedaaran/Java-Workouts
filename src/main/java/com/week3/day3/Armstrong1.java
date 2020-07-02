package com.week3.day3;

public class Armstrong1 {
	
//	Print the armstrong numbers between 1 and 1000

	public static void main(String[] args) {
		int n = 153;
		int a=0,remainder,temp;
		temp=n;
		
		
		while (n>0) {
			remainder=n%10;
			n=n/10;
			a=a+(remainder*remainder*remainder);
		}
		
		if (temp==a) {
			System.out.println("Given number is armstrong");
		}
		else {
			System.err.println("Given number is not armstrong");
		}
	}

}
