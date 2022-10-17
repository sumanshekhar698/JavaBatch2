package com.java8.oops.interfaces.exception_handling;

import java.io.InputStreamReader;
import java.util.Scanner;

public class TryCatchResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		try with resource
		try (Scanner scanner = new Scanner(System.in);){
			
			String next = scanner.next();
			System.out.println(next);
			System.out.println(8 / 0);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}finally {
			
		}

	}

}
