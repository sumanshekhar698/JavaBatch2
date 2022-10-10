package com.java8.oops.arrays;

import java.util.Arrays;

public class AnagramChecker {

	public static void main(String[] args) {

		String s1 = "SILENT";
		String s2 = "LISTEN";

		char[] charArray1 = s1.toCharArray();
		Arrays.sort(charArray1);//Buble Sort

		char[] charArray2 = s2.toCharArray();
		Arrays.sort(charArray2);

		System.out.println(Arrays.equals(charArray1, charArray2));
	}

}
