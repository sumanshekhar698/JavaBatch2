package com.java8.oops.basics;

public class WrapperClasses {// Partially Object Oriented

	public static void main(String[] args) {

//		Primitive Data Type
//		byte a = 7;
//		short b = 77;
//		int c = 777;
//		long d;
//		d = 867886689l;
//		d = b;

//		Wrapper Claases
		Byte b1 = new Byte("77");
//		b1.hashCode();
		System.out.println(b1.hashCode());

		Boolean boolean1 = new Boolean("false");
		System.out.println(boolean1);

//		Correct Way
		Boolean boolean2 = true;
		Integer num = 9;
		Character ch = 'c';

	}

}
