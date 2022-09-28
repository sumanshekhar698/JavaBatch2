package com.java8.oops.arrays;

public class MainArgs {

	public static void main(String[] scoobyDoobyDoo) {// var array
		// String args is used tio give inputs before running the program,
		// and it will be evaluated during runtime
		System.out.print(scoobyDoobyDoo.length);
		for (int i = 0; i < scoobyDoobyDoo.length; i++) {
			System.out.print(scoobyDoobyDoo[i] + " ");
		}
	}

}
