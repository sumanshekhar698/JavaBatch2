package com.java8.oops.interfaces.exception_handling;

import java.util.Arrays;

public class MutipleExceptionCathchInASingleLine {

	public static void main(String[] args) {

		if (true) {
			Arrays.sort(new int[] { 3, 6, 7 });
		}

//		if (true) {
//			int i;
//		}
		System.out.println("START");

		int[] arr = { 4, 6, 8, 3 };

		System.out.println(args[0]);// JAVA will not force you to handle ====> Unchecked Exception

//		Thread.sleep(5000);//Checked Exception


//try {
//	Thread.sleep(5000);//Checked Exception
//
//}

		// Java will force you , you must handle
		System.out.println("END");

	}
}
