package com.java8.oops.exception_handling;

import java.util.Scanner;

class StackExample {
	public static void check(int i) {
		if (i == 0)
			return;
		else {
			check(i++);
		}
	}
}

public class Main {

	public static void main(String[] args) {
//		StackExample.check(5);

		try {
			while (true) {
				Scanner scanner = new Scanner(System.in);
			}
		} catch (Throwable t) {

		}
	}
}