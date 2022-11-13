package com.java8.file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileWritingRobust {

	public static void main(String[] args) {

		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(
					"C:\\Users\\suman\\eclipse-workspace\\YhillsJavaBactch2\\src\\resources\\simran.txt");
			fileOutputStream.write("Simran is studying in Java".getBytes());
			System.out.println(Arrays.toString("Simran is studying in Java".getBytes()));
			fileOutputStream.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
