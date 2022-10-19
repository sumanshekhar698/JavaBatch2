package com.java8.file_io;

import java.io.File;

public class DeletingAFile {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\suman\\eclipse-workspace\\YhillsJavaBactch2\\src\\resources\\io8.txt");
		System.out.println(file.exists());

		boolean delete = file.delete();
		System.out.println(delete);

	}

}
