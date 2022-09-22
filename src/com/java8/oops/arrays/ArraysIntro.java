package com.java8.oops.arrays;

import java.util.Arrays;

public class ArraysIntro {
	Integer x;

	public static void main(String[] args) {

//		1 D
		Integer fiboArray[] = new Integer[6];// ecalring and intializing the default values
		int fiboArray2[] = new int[6];// decalring and intializing the default values

		int naturalNumbers[] = { 1, 2, 3, 4, 5, 6 };
		naturalNumbers[0] = 0;

		System.out.println(fiboArray);

		for (int i = 0; i < fiboArray.length; i++) {
			System.out.print(fiboArray[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < fiboArray2.length; i++) {
			System.out.print(fiboArray2[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < naturalNumbers.length; i++) {
			System.out.print(naturalNumbers[i] + " ");
		}

		System.out.println();
		int[] ans = generateFibonacciSeries(20);
		System.out.println(Arrays.toString(ans));

//		new Employee();

	}

	 static int[] generateFibonacciSeries(int num) {

		if (num == 0)
			return new int[] {};
		else if (num == 1)
			return new int[] { 0 };
		else if (num == 2)
			return new int[] { 0, 1 };

		int[] fiboArray = new int[num];

		fiboArray[0] = 0;
		fiboArray[1] = 1;

		for (int i = 2; i < fiboArray.length; i++) {
			fiboArray[i] = fiboArray[i - 1] + fiboArray[i - 2];
		}

		return fiboArray;
	}

}
