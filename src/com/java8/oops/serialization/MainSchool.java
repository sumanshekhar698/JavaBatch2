package com.java8.oops.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainSchool {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		final String path = "C:\\Users\\suman\\eclipse-workspace\\YhillsJavaBactch2\\src\\resources\\EmployeeRecord.txt";

		School s1 = new School("DAV", "BLR");
		School s2 = new School("DENOBILI", "CAL");

		// SERIALIZATION
//		FileOutputStream fOut = new FileOutputStream(path);
//		ObjectOutputStream oOut = new ObjectOutputStream(fOut);
//		oOut.writeObject(s1);
//		oOut.writeObject(s2);
//
//		oOut.flush();
//		oOut.close();

		// DESRIALIZATION
		FileInputStream fIS = new FileInputStream(path);
		ObjectInputStream oIS = new ObjectInputStream(fIS);
		School si1 = (School) oIS.readObject();
		School si2 = (School) oIS.readObject();

		System.out.println(si1);
		System.out.println(si2);

		// static are not Serializabele
	}
}
