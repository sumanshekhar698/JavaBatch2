package com.java8.oops.interfaces.marker;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		int[] arr = { 2, 5, 6, 7 };
		int[] clone = arr.clone();
		int arr2[] = arr;

		clone[0] = 4;
//		arr2[0]=4;

		System.out.println(Arrays.toString(arr));

		Student s1 = new Student(1, "Virat", 655434360);
		Student s2 = (Student) s1.clone();

//		System.out.println(s1);
		s1.id = 3;
		System.out.println(s1);
		System.out.println(s2);

	}
}
