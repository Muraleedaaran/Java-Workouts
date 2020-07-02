package com.week3.day5;

public class MatrixTranspose1 {
	
//	Write a java program to transpose the matrix.
//	Actual Matrix
//	1 2 3 
//	4 5 6 
//	7 8 9 
//	Transposed Matrix
//	1 4 7 
//	2 5 8 
//	3 6 9

	public static void main(String[] args) {
		int[][] matrix1 = new int[3][3];
		int[][]result = new int[3][3];
		int count = 1;
		int temp=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix1[i][j] = count++;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				temp = matrix1[i][j];
				i+=j;
				j=i-j;
				i-=j;
				result[i][j] = temp;
				i+=j;
				j=i-j;
				i-=j;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
