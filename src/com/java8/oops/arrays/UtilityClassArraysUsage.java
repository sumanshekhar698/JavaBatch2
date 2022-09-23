package com.java8.oops.arrays;

import java.util.Arrays;

public class UtilityClassArraysUsage {

	public static void main(String[] args) {
		// TODO
		// Bubble Sort //Merge Sort //Quick Sort //Heap Sort
		// Binary Search (The array should be sorted)

		int x[] = { 1, -4, 5, 888, 5, 34, 9 };// { 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
		Arrays.sort(x);// Ascending Order
		System.out.println(x);
		System.out.println(Arrays.toString(x));

		System.out.println(x.length);// 7

		for (int i = 0; i < x.length; i++) {
			x[i] = 1000;
		}

		System.out.println(Arrays.toString(x));// { 1000, 1000, 1000, 1000, 1000, 1000, 1000 }

		Arrays.fill(x, 100);
		System.out.println(Arrays.toString(x));// { 100, 100, 100, 100, 100, 100, 100 }

		Arrays.fill(x, 2, 5, 80);
		System.out.println(Arrays.toString(x));// { 100, 100, 80, 80, 80, 100, 100 }

		for (int i = 0; i < x.length; i++) {
			if (i % 2 == 0)
				System.out.println(x[i] + " ");
		}

		for (int i = 0; i < x.length; i += 2) {
			System.out.println(x[i] + " ");
		}

	}

}
