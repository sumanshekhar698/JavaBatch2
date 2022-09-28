package com.java8.basics;

import java.util.Scanner;

public class ScannerSpecialCase {

	public static void main(String[] args) {

		System.out.println("START");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer number");
		int i = sc.nextInt();// int input
		System.out.println(i);
		System.out.println("Enter a String value");

		sc.nextLine();// Skipped 'Flushing'

		String str1 = sc.nextLine();// Special Case
		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println("END");
		sc.close();// Closing

//		sc.next(); //java.lang.IllegalStateException: Scanner closed

	}

}
