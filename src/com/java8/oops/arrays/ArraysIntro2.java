package com.java8.oops.arrays;

import java.util.Arrays;

public class ArraysIntro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 4, 5 };
		int y[] = { 1, 4, 5 };//
		int[] z = { 1, 4, 5 };

		int l, m, n = 9;

		int a, b[];// a is a int, b is a int array
//		int q,[] r;

		if (x == y)
			System.out.println("1" + true);
		if (x == z)
			System.out.println("2" + true);// //
		if (x == x)
			System.out.println("3" + true);//
		if (y == z)
			System.out.println("4" + true);
		if (y == z)
			System.out.println("4" + true);

//		int num = 8;
		System.out.println(Arrays.toString(z));// 1 4 5
		System.out.println(z.hashCode());

		modify(z);
		System.out.println(z.hashCode());
//		System.out.println(num);//8
		System.out.println(Arrays.toString(z));//9 4 5

	}

	private static void modify(int num[]) {// pass by ref 
		num[0] = 9;
		System.out.println(num.hashCode());

	}

}
