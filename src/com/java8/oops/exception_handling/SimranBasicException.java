package com.java8.oops.exception_handling;

import java.util.Arrays;

public class SimranBasicException {
	Float f;// instance variables
	int x;// 0
	String str;// null
	float s;// 0.0
	Float S;// null

	public static void main(String[] args) {
		System.out.println("STARt");

//		int x = 9;
		Integer y = 9;
//		Float f;

		int[] a = new int[5];
		String[] b = { "Simran", "Jack", "Monkey" };
		System.out.println(a);
		System.out.println(b);

//		SimranBasicException s1 = new SimranBasicException();
//		System.out.println(s1.f);

		for (int i = 0; i < b.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println(Arrays.toString(a));

//		try {
//			System.out.println("M1");
		System.out.println(b[1]);// UNCHECKED EXCEPTION
//			System.out.println("M2");
//		} catch (Exception e) {
//			System.out.println(e);
//		}

//		System.out.println(5 / 0);

		System.out.println(0.0 / 0.0);

		try {
			Thread.sleep(3000);// CHECKED
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("END");

	}

}
