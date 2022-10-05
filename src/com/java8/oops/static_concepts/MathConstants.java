package com.java8.oops.static_concepts;

public class MathConstants {

	final static public float goldenRatio = 1.618f;
	
	private static int key = 8;
	
	void access() {
		System.out.println(key);
		System.out.println(MathConstants.key);
	}
	
	static void remeber() {
		
		System.out.println(key);
		System.out.println();
//		System.out.print();
	}

}
