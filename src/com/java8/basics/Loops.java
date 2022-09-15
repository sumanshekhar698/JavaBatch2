package com.java8.basics;

import java.util.Scanner;//ctrl + shift + O

//java.lang is an inbuilt package which imported by Default

public class Loops {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please give a input int");
		int input = sc.nextInt();// say 5

//		for	loop
//		Initialization; condition checking ; updation
		firstLoop: for (int i = 0; i < input; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

//		while loop
		int temp = 0;
		while (temp < input) {
			System.out.print(temp++ + " ");
		}
		System.out.println();

//		do while loop
		do {
			System.out.println(temp);
		} while (temp > input);

//		System.out.println(i);//will get error as i is declared local to the for loop
//		for variant
		for (; temp < 10;) {
			System.out.println("X");
			temp++;
		}

	}

}
