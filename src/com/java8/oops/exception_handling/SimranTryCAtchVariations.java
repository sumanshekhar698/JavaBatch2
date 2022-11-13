package com.java8.oops.exception_handling;

import java.util.Scanner;

public class SimranTryCAtchVariations {

	public static void main(String[] args) {
		System.out.println("START");
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println(sc.next());
			Thread.sleep(1000);
			System.exit(8);
//			System.out.println(9 / 0);
//			return;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("FINALLY");
			sc.close();
		}

		System.out.println("END");

	}

}
