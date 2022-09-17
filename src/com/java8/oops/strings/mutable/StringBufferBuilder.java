package com.java8.oops.strings.mutable;

public class StringBufferBuilder {

	public static void main(String[] args) {

		//Mutable Strings
		StringBuilder stringBuilder = new StringBuilder("ronnie");
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.hashCode());
		stringBuilder.append("thomas ");
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.hashCode());

		
		StringBuffer sb2 = new StringBuffer("ronnie");
		System.out.println(sb2);
		System.out.println(sb2.hashCode());
		sb2.append("thomas ");
		System.out.println(sb2);
		System.out.println(sb2.hashCode());

	}

}
