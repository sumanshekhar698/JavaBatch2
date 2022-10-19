package com.java8.file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingRobust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(
					"C:\\Users\\suman\\eclipse-workspace\\YhillsJavaBactch2\\src\\resources\\io.txt");
//			int read = fileInputStream.read();
			int read = 0;
			while ((read=fileInputStream.read()) !=-1) {
				System.out.print((char)read);
			}
			
			fileInputStream.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
