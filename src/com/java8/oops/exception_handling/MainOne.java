package com.java8.oops.exception_handling;

import java.util.Arrays;

public class MainOne {

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

		try {
			Thread.sleep(5000);
			System.out.println("SLEEPING");
			System.out.println(7 / 0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		catch (Throwable e) {
//			e.printStackTrace();
//		}

		// Java will force you , you must handle
		System.out.println("END");

	}
}
