package com.java8.oops.arrays.two_d;

public class CloningA2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = { { 4, 6, 8, 5, 22, 6 }, { 7, 4, 5 }, { 34, 34, 5, 6, 4, 23, 5 } };

		int[][] matrixClone = matrix.clone();
//		matrixClone[0][0] = 99;

		int[][] realClone = new int[matrix.length][];
		for (int i = 0; i < realClone.length; i++) {
			realClone[i] = matrix[i].clone();
		}

		realClone[0][0] = 999;
		System.out.println(matrix[0][0]);// 99

	}

}
