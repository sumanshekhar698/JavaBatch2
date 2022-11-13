package com.java8.oops.exception_handling;

import java.util.Scanner;

public class TryCatchCombos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String next = scanner.next();
		System.out.println(next);
		try {
			scanner.close();
		} finally {
			scanner.next();
		}

	}

}
