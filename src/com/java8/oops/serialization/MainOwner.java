package com.java8.oops.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainOwner {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		final String path = "C:\\Users\\suman\\eclipse-workspace\\YhillsJavaBactch2\\src\\resources\\EmployeeRecord.txt";

		OwnerRecord owner = new OwnerRecord(0, "James", 30, 60, 9);

		// SERIALIZATION
//		FileOutputStream fOut = new FileOutputStream(path);
//		ObjectOutputStream oOut = new ObjectOutputStream(fOut);
//		oOut.writeObject(owner);
//		oOut.flush();
//		oOut.close();

		// DESRIALIZATION
		FileInputStream fIS = new FileInputStream(path);
		ObjectInputStream oIS = new ObjectInputStream(fIS);
		EmployeeRecord e2 = (EmployeeRecord) oIS.readObject();
		System.out.println(e2);

		// static are not Serializabele

	}

}
