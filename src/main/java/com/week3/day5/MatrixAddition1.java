package com.week3.day5;

public class MatrixAddition1 {

//	Write a java program to add to matrices
//	Matrices 1:
//	1 2 3 
//	4 5 6 
//	7 8 9 
//	Matrices 2:
//	9 8 7 
//	6 5 4 
//	3 2 1 
//	Solution: 
//	10 10 10 
//	10 10 10 
//	10 10 10

	static int count = 0;

	public static void main(String[] args) {
		int[][] matrix1 = new int[3][3];
		int[][] matrix2 = new int[3][3];
		int[][] result = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix1[i][j] = count++;
			}
		}
//		count++;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix2[i][j] = count--;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				result[i][j] = matrix1[i][j]+matrix2[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
