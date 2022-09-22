package com.java8.oops.strings.immutable;

public class StringConversion {

	public static void main(String[] args) {

		String num = "78";

//		Integer i1 = new Integer("80000");
//		System.out.println(i1.toString());
//		Integer v1 = i1.valueOf(num);//Condition the supplied String is having Integer satisfying values
//		System.out.println(v1);
//		System.out.println(i1.toString());

//		valueOf() is a Integer Util methods
		Integer number1 = Integer.valueOf(num);// Code Readablity
		System.out.println(number1);

		int number2 = Integer.parseInt(num);// * REDCOMMENDED
		System.out.println(number2);

		String num2 = "" + number2;// *
		System.out.println(num2.length());

		String stringNum2 = String.valueOf(number2);// REDCOMMENDED
		System.out.println(stringNum2);

		String stringNum1 = number1.toString();
		System.out.println(stringNum1);

//		(7%7)*(7/7)*(7+7)
		System.out.println(7 + 8 * 3 + "");// "31"
		System.out.println("" + 7 + 8 + 3);// "7" + 8 +3 ==> "78" +3 ==> "783"
		System.out.println("" + 7 + 8 * 3);// "" + 7 + 24 // "724"

	}

}
