package com.java8.oops.arrays;

import java.util.Arrays;

public class VarArray {

	public static void main(String... args) {
		printString("Fox", "Lion", "Bear", "Fish", "Koala");
	}

	private static void printString(String s) {
		System.out.println(s);
	}

	private static void printString(String s1, String s2) {
		System.out.println(s1 + " " + s2);
	}

	private static void printString(String... str) {
//		System.out.println(s1);
		System.out.println(Arrays.toString(str));
	}

}
