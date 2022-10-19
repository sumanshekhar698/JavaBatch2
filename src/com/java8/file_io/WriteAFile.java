package com.java8.file_io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {

	public static void main(String[] args) {

		try {
			FileWriter fileWriter = new FileWriter(
					"C:\\Users\\suman\\eclipse-workspace\\YhillsJavaBactch2\\src\\resources\\io.txt");
			fileWriter.write("File Handling is Easy");
			fileWriter.close();// flushing
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
