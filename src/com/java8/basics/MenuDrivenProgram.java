package com.java8.basics;

import java.util.Scanner;

public class MenuDrivenProgram {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);// Ctrl + 2 LEAVE press L

		/*
		 * if (option == 1) System.out.println(input * input); else if (option == 2)
		 * System.out.println(Math.sqrt(input)); else if (option == 3)
		 * System.out.println(input * input * input); else
		 * System.out.println("Invalid Operation");
		 */

		/*
		 * Ctrl + Shift + / ---> Multi line comment
		 */

		boolean condition = true;
		outer: while (condition) {// loops can be named for fine grain control over them
			System.out.println("Enter 1 for square\nEnter 2 for square root \nEnter 3 for cube \nEnter 0 for Exit");
			int option = scanner.nextInt();
			System.out.println("Enter the number");
			int input = scanner.nextInt();
			switch (option) {// ladder
			case 0: {
//				condition =false;
//				return;
				break outer;
			}
			case 1: {
				System.out.println(input * input);
				break;
			}
			case 2: {
				System.out.println(Math.sqrt(input));
				break;
			}
			case 3: {
				System.out.println(input * input * input);
				break;
			}
			default: {
				System.out.println("Invalid Operation");
			}
			}
			System.out.println();
		}

	}

}
