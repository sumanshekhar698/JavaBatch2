package com.java8.oops.arrays;

import com.java8.oops.basics.Employee;

public class ArraysIntro4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] eList = new Employee[5];

		// 6
		for (int i = 0; i < eList.length; i++) {
			eList[i] = new Employee();
		}

		System.out.println(eList[5]);

	}

}
