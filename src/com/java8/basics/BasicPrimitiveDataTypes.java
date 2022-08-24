package com.java8.basics;

public class BasicPrimitiveDataTypes {

	public static void main(String[] args) {

//		1 Byte = 8 bits
//		integers
		byte a = 7;
		short b = 77;
		int c = 777;
		long d;
		d = 867886689;

//		b = d;//not possible as of size limit
		d = b;

//		decimals
		float e = 9.890f;// 32 bit size | f is required at end while storing float
		double f = 9.877;// 64 bit size

		float x = d;// REMEMBER this corner case - long can be stored inside a float despite of size
					// differences

//		boolean
		boolean isJavaEasy = true;
		isJavaEasy = false;

//		character
		char rupee = '₹';// UTF-16

		rupee = 'A';
		c = rupee;
		System.out.println(c);// 8377

		b = 759;
		char ch = (char) b;// Explicit conversion
		System.out.println(ch);

//		Java can store numbers in other format but will always print in decimal format
		int bin = 0b101001;
		System.out.println(bin);// Binary

		int oct = 0101701;
		System.out.println(oct);// Octal

		int hex = 0x789A;
		System.out.println(hex);// Hexadecimal

	}

}
