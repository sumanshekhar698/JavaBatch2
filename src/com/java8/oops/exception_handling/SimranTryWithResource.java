package com.java8.oops.exception_handling;

import java.util.Scanner;

public class SimranTryWithResource {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {
			System.out.println(sc.next());
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
