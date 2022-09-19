package com.java8.oops.strings.mutable;

public class StringBufferBuilder {

	public static void main(String[] args) {

		// Mutable Strings
		StringBuilder stringBuilder = new StringBuilder("ronnie");
		System.out.println(stringBuilder);// ronnie
		System.out.println(stringBuilder.hashCode());// 89689a
		stringBuilder.append("thomas ");// ronniethomas
		System.out.println(stringBuilder);// ronniethomas
		System.out.println(stringBuilder.hashCode());// it will be same
		stringBuilder.reverse();
		stringBuilder = stringBuilder.append(8.9);
		System.out.println(stringBuilder);

		StringBuilder sb1 = new StringBuilder("ronnie");
		StringBuilder sb2 = new StringBuilder("ronnie");

		if (sb1 == sb2)
			System.out.println(true);
		else
			System.out.println(false);// false

//		sb1=sb2;
		System.out.println(checkEqual(sb1, sb2));// true

		System.out.println(sb1.equals(sb2));// false as it will again compare address as it will not compare characters
		System.out.println(sb1.toString().equals(sb2.toString()));// niche trick to compare

		// TO DO -Assignment
//		StringBuffer sb3 = new StringBuffer("ronnie");
//		System.out.println(sb3);
//		System.out.println(sb3.hashCode());
//		sb2.append("thomas ");
//		System.out.println(sb3);
//		System.out.println(sb3.hashCode());

	}

	static boolean checkEqual(StringBuilder sb1, StringBuilder sb2) {
		if (sb1 == null || sb2 == null)
			return false;

		if (sb1.length() != sb2.length())
			return false;

		for (int i = 0; i < sb1.length(); i++) {
			if (sb1.charAt(i) != sb2.charAt(i))
				return false;
		}
		return true;
	}

}
