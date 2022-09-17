package com.java8.oops.strings.immutable;

public class StringInroduction {

	public static void main(String[] args) {

//		A string is just a sequence of characters

		int x = 9898;
		int y = 9898;
		String x_ = "9898";

//		Immutable Strings

//		1. By String Literal --> String POOL which is a part of heap
		String name = "Rocky";
		String city;
		city = "Jaipur";

		String str1 = "Jamie";
		String str2 = "Jamie";
		String str0 = "jamie";

//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		System.out.println(str0.hashCode());

		str1 = "Jill";
		str2 = "jamie";
//		System.out.println(str1.hashCode());

		if (x == y)
			System.out.println(true);// true
		else
			System.out.println(false);

		if (str1 == str2)
			System.out.println(true);
		else
			System.out.println(false);

//		2. By new keyword ----> It will be inside HEAP
		String str3 = new String("Jennie");
		String str4 = new String("Jennie");

		// == operator while using with Objects compare their reference address
		if (str3 == str4)
			System.out.println(true);
		else
			System.out.println(false);// false

		str3 = str3.concat(" Billy");// append
		str3 = str3 + " of England" + str3;

		System.out.println(str3);
		System.out.println(str3.equals(str4));// equals() compares contents and this only for Strings

		// equals() is stricltly case sensitive
		str3 = " a b = 0 u   ";
		System.out.println(str3.charAt(0));
		System.out.println(str3.contains("= 0"));
		str3 = str3.trim();
		System.out.println(str3);

		System.out.println(str3.toUpperCase());
		str3 = str3.toUpperCase();
		System.out.println(str3);

		String str5 = "Jammu";
		String str6 = "jammu";
		System.out.println(str5 == str6);// false
		System.out.println(str5.equals(str6));// false
		System.out.println(str5.equalsIgnoreCase(str6));// true
		System.out.println(str5.length());
		System.out.println(str6.substring(2, 4));
		System.out.println(str6.charAt(str6.length() - 1));
		str6 = str6.replace('u', 'z');
		System.out.println(str6);// jammz

		
		String num1 = "799 2256154";
		// REGEX is a language independent thing | validation
		boolean matches = num1.matches("[0-9.]+");
		System.out.println(matches);
		System.out.println(num1.substring(num1.length()-2));
		
		String sub= num1.substring(2, 4);
//		CharSequence subSequence = num1.subSequence(2, 4);


	}

}
