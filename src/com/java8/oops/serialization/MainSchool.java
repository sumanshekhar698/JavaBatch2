package com.java8.oops.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainSchool {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		final String path = "C:\\Users\\suman\\eclipse-workspace\\YhillsJavaBactch2\\src\\resources\\EmployeeRecord.txt";

		School s1 = new School("DAV", "BLR");

		// SERIALIZATION
//		FileOutputStream fOut = new FileOutputStream(path);
//		ObjectOutputStream oOut = new ObjectOutputStream(fOut);
//		oOut.writeObject(s1);
//		oOut.flush();
//		oOut.close();

		// DESRIALIZATION
		FileInputStream fIS = new FileInputStream(path);
		ObjectInputStream oIS = new ObjectInputStream(fIS);
		School s = (School) oIS.readObject();
		System.out.println(s);

		// static are not Serializabele
	}
}
