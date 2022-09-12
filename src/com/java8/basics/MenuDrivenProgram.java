package com.java8.basics;

import java.util.Scanner;

public class MenuDrivenProgram {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);// Ctrl + 2 LEAVE press L

		System.out.println("Enter 1 for square\n Enter 2 for square root \n Enter 3 for cube");
		int option = scanner.nextInt();
		System.out.println("Enter the number");
		int input = scanner.nextInt();

		/*
		 * if (option == 1) System.out.println(input * input); else if (option == 2)
		 * System.out.println(Math.sqrt(input)); else if (option == 3)
		 * System.out.println(input * input * input); else
		 * System.out.println("Invalid Operation");
		 */

		/*
		 * Ctrl + Shift + / ---> Multi line comment
		 */

		switch (option) {
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

	}

}
