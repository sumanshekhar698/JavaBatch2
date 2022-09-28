package com.java8.oops.arrays.two_d;

public class SimpleBruteSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = { { 4, 6, 8, 5, 22, 6 }, { 7, 4, 5 }, { 34, 34, 5, 6, 4, 23, 5 } };

		int num = 233;
		String cords = seacrhBrute2D(num, matrix);
		System.out.println(cords);

	}

	private static String seacrhBrute2D(int num, int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == num)
					return "" + i + " " + j;
			}
		}

		return "not found";

	}

}
