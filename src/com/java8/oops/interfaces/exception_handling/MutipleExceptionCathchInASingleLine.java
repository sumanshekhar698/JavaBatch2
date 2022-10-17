package com.java8.oops.interfaces.exception_handling;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;

public class MutipleExceptionCathchInASingleLine {

	public static void main(String[] args) {

		if (true) {
			Arrays.sort(new int[] { 3, 6, 7 });
		}

		System.out.println("START");

		int[] arr = { 4, 6, 8, 3 };

		System.out.println(args[0]);// JAVA will not force you to handle ====> Unchecked Exception

		try {

			Thread.sleep(5000); // Checked Exception
		} catch (InterruptedException | ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("END");

	}
}
