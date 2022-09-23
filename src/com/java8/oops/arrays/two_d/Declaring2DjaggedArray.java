package com.java8.oops.arrays.two_d;

import java.util.Arrays;

public class Declaring2DjaggedArray {

	public static void main(String[] args) {

		int[][] matrix = new int[4][];// 0
		matrix[0] = new int[5];
		matrix[1] = new int[5];
		matrix[2] = new int[9];
		matrix[3] = new int[5];

//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}



	}

}
