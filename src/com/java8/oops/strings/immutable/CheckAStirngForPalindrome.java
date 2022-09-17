package com.java8.oops.strings.immutable;

import java.util.Scanner;

public class CheckAStirngForPalindrome {
//madam rotor radar level RadAr
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input STRING to check");
		String str1 = sc.nextLine();
		boolean ans = new CheckAStirngForPalindrome().isPalindrome(str1);
		System.out.println(ans);

	}

	boolean isPalindrome(String str1) {
//		time and space trade off
		str1 = str1.toLowerCase();
//		String reversed = "";//eating memory
//		for (int i = str1.length() - 1; i >= 0; i--) {//eating my time
//			reversed += str1.charAt(i);
//		}
//
//		return str1.equalsIgnoreCase(reversed);
		int i = 0;
		int j = str1.length() - 1;
		while (j >= i) {
			if (str1.charAt(i) != str1.charAt(j))
				return false;

			j--;
			i++;
		}
		return true;

//		KISS
	}

}
