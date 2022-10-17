package com.java8.oops.arrays.two_d;

import java.util.Arrays;

public class Array2DIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = {4,4567,75647,676,3};
		System.out.println(Arrays.toString(arr));
//		Symmetric 2 D array
		int[][] regualarSymetric2Darray = { { 1, 3, 4, 5 }, { 4, 7, 3, 8 }, { 987, 7, 8, 7 } };

		System.out.println(regualarSymetric2Darray[1][2]);

		int[][] jaggedArray = { { 1, 3, 4, 5 }, { 4, 7, 3, 8, 99 }, { 987, 7, 8, 7 } };

		System.out.println(jaggedArray[1][2]);

		int[][] matrix = new int[4][4];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = i * j;
			}
//			System.out.println();
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				
//				if(i==j)
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
