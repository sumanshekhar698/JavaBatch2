package com.java8.oops.arrays;

import java.util.Arrays;

import com.java8.oops.basics.Employee;

public class ArrayQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr1 = new Integer[5];
		Float[] arr2 = new Float[5];

		Object[] arr3 = new Object[5];
		arr3[0] = new Integer(8);
		arr3[1] = "java";
		arr3[4] = new Employee();
		System.out.println(Arrays.toString(arr3));

	}

}
