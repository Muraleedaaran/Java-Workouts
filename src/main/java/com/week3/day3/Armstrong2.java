package com.week3.day3;

public class Armstrong2 {

//	Print the armstrong numbers between 1 and 1000

	public static void main(String[] args) {
		int n = 1000;

		for (int i = 1; i <= n; i++) {
			int a = 0, remainder, temp;
			temp = i;
			while (i > 0) {
				remainder = i % 10;
				i = i / 10;
				a = a + (remainder * remainder * remainder);
			}

			if (temp == a) {
				System.out.println("Number " + temp + " is an armstrong number");
			}
//			else {
//				System.out.print("Number " + temp + " is ");
//				System.err.println("not an armstrong number");
//			}
			i = temp;
		}
	}

}
