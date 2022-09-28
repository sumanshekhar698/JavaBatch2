package com.java8.oops.arrays.two_d;

public class SearchingIn2DarrayOptimized {

	public static void main(String[] args) {

		int item = 29;
		int x[][] = { // full sorted matrix
				{ 10, 21, 30, 40 }, 
				{ 15, 25, 36, 45 }, 
				{ 27, 29, 37, 48 }, 
				{ 32, 33, 39, 50 } };

		
		int n = x.length;//rows
		int m = x[0].length;//columns
		
//		int i = 0, j = x.length - 1;
		int i = 0, j = x[0].length - 1;

//		Only applicable for fully sorted matrix
//		O(n) = n + m = n
		
		while (i < x.length && j >= 0) {
			if (x[i][j] == item) {
				System.out.println("Item Found -> [" + i + " " + j + "]");
				break;
			} else if (x[i][j] > item)
				j--;
			else
				i++;
		}

	}
}
