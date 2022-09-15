package com.java8.oops.strings;

public class StringIntro {

	public static void main(String[] args) {

//		Strings can be handled in Java in 4 ways

//		Immutable Strings
		String name = "James Gosling";// String creation using String literal
		String country = new String("Denmark");// using new Keyword

//		Mutable Strings
		StringBuffer sbuf = new StringBuffer();
		StringBuilder sbul = new StringBuilder();

//		Convert a primitive type to String
		Integer x = 8;
		String string = x.toString();
		System.out.println(x);

		int y = 8;
		String y_ = "" + y;
		System.out.println(y_);

		String str1 = "queen";
		String str2 = "queen";

		String str3 = str1 + str2;// concatenation is joining of 2 strings
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		String num = "78";
		String emptyString = "";

		if (str1 == str2)// not compare the content , it will just compare the hashcode
			System.out.println(true);// true
		else
			System.out.println(false);

		String string2 = new String("queens");//
		System.out.println(string2.hashCode());

		String string3 = new String("queens");//
		System.out.println(string3.hashCode());
		string3 = "ki ng";
		System.out.println(string3.hashCode());

		if (string2 == string3)
			System.out.println(true);
		else
			System.out.println(false);

		if (string2.equals(string3))
			System.out.println(true);
		else
			System.out.println(false);

		System.out.println("We" + "wil work " + "in Java" + 8);
	}

}
