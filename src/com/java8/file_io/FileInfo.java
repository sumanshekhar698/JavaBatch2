package com.java8.file_io;

import java.io.File;
import java.io.IOException;

public class FileInfo {

	public static void main(String[] args) {

		String x = "\"";
		File file = new File("C:\\Users\\suman\\eclipse-workspace\\YhillsJavaBactch2\\src\\resources\\io.txt");

		boolean exists = file.exists();
		System.out.println(exists);

		if (exists) {
			String absolutePath = file.getAbsolutePath();
			String name = file.getName();
			boolean canRead = file.canRead();
			boolean canWrite = file.canWrite();
			System.out.println(absolutePath);
			System.out.println(name);
			System.out.println(canRead);
			System.out.println(canWrite);

		} else {
			System.out.println("File is not existing");
		}

	}

}
