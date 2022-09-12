package com.java8.basics;

public class BasicPrimitiveDataTypes {

	public static void main(String[] args) {

//		1 Byte = 8 bits
//		integers
		byte a = 7;//1 byte of memory = 8 bits
		short b = 77;//local variable local to main only//2 byte = 16
		int c = 777;//4 byte = 32 bits
		long d;//8 byte = 64 bits
		d = 867886689l;

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
		char rupee = 'y';// UTF-16

		rupee = '₹';
		c = rupee;
		System.out.println(c);// 8377

		b = 759;
		char ch = (char) b;// Explicit conversion
		System.out.println(ch);

//		Java can store numbers in other format but will always print in decimal format
		int bin = 0b101001;//101001
		System.out.println(bin);// Binary

		int oct = 01017031;//101701
		System.out.println(oct);// Octal

		int hex = 0x789A;
		System.out.println(hex);// Hexadecimal
		
		
//		78.89
		float num3 = 0b011010;
		System.out.println(num3);
//		String binaryString = Integer.toBinaryString(26);
//		System.out.println(binaryString);

	}

}
