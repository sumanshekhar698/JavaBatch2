package com.java8.file_io;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {

		String x = "\"";
		File file = new File("C:\\Users\\suman\\eclipse-workspace\\YhillsJavaBactch2\\src\\resources\\io.txt");

		boolean report = false;
		try {
			report = file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(report);
		
		
		

	}

}
