package com.java8.oops.interfaces.exception_handling;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		String next = scanner.next();
		System.out.println(next);

		try {
//			System.out.println(8 / 0);
//			System.out.println(args[0]);
//			while(true) {
//				
//			}
//			System.exit(0);
		} catch (Exception e) {//Exceptions catching Errors
			System.out.println("CATCH1");
			System.out.println(8 / 0);
			System.out.println(e.getStackTrace());
			System.out.println("CATCH2");
		} finally {
			scanner.close();
			System.out.println("FIANLYY !!!");
		}

		System.out.println("END");

	}

}
