package com.java8.file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingRobust {

	public static void main(String[] args) {

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(
					"C:\\Users\\suman\\eclipse-workspace\\YhillsJavaBactch2\\src\\resources\\io.txt");
			fileOutputStream.write("Java is good".getBytes());
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
