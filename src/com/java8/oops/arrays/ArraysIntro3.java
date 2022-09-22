package com.java8.oops.arrays;

import java.util.Arrays;

public class ArraysIntro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[] = { 1, 4, 5 };

//		int y[] = x;
		int[] y = new int[x.length];

		if (y.length == x.length)
			for (int i = 0; i < y.length; i++) {
				y[i] = x[i];
			}
//		y[0] = 999;
		System.out.println(Arrays.toString(y));//
		System.out.println(Arrays.toString(x));//

		int z[] = x.clone();// clone is striclty confined to 1D arrays
		System.out.println(Arrays.toString(z));//
		z[0] = 98;
		System.out.println(Arrays.toString(x));//

	}

}
