package com.java8.oops.arrays;

import java.util.Arrays;

public class BinarySearch {

	public static int y = 9;

	public static void main(String[] args) {

//		int[] y = new int[Integer.MAX_VALUE];
		int x[] = { 1, -4, 5, 888, 5, 34, 9 };

		int searchElement = 35;
		// PreCondition check

		Arrays.sort(x);
		System.out.println(y);
		System.out.println(Arrays.toString(x));// [-4, 1, 5, 5, 9, 34, 888]
		int position = binarySearch(x, searchElement);
		System.out.println(position);

	}

	// ascending
	private static int binarySearch(int[] x, int searchElement) {
		// [-4, 1, 5, 5, 9, 34, 888]

//		O (log2 n)
		int i = 0;
		int j = x.length - 1;
		int m = 0;

		while (j >= i) {
//			m = (i + j) / 2;
			m = i + (j - i) / 2;

//			m = i / 2 + j / 2;

			if (x[m] == searchElement)
				return m;

			if (x[m] < searchElement)
				i = m + 1;
			else
				j = m - 1;
		}
		return -1;
	}

}
