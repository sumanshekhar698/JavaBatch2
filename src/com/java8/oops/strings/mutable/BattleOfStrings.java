package com.java8.oops.strings.mutable;

public class BattleOfStrings {

	public static void main(String[] args) {

//		Test 1: String
		String sample1 = "Rocky ";
		long start = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
//			sample1 += "BHAI ";
			sample1 = sample1.concat("BHAI ");
		}
		long end = System.nanoTime();
		System.out.println(end - start);

//		Test 2: StringBuilder
		StringBuilder sb = new StringBuilder("Rocky ");
		start = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			sb.append("BHAI ");
		}
		end = System.nanoTime();
		System.out.println(end - start);

//		Single Threaded ---> String Builder is preferred but we can also use String Buffer comprising some performance
//		Multi-threaded ---> *StringBuilder is preferred for thread safety

	}

}
