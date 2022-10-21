package com.java8.oops.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		final String path = "C:\\Users\\suman\\eclipse-workspace\\YhillsJavaBactch2\\src\\resources\\EmployeeRecord.txt";
//		EmployeeRecord e1 = new EmployeeRecord(1, "Chris", 10, 40);
//		EmployeeRecord e2 = new EmployeeRecord(2, "Mands", 10, 20);
//		EmployeeRecord e3 = new EmployeeRecord(6, "Eve", 1, 40);
//		EmployeeRecord e4 = new EmployeeRecord(11, "Ronniw", 20, 50);
//		EmployeeRecord e5 = new EmployeeRecord(21, "evan", 5, 24);

//		System.out.println(e1);
//		System.out.println(e2);
//		System.out.println(e3);
//		System.out.println(e4);
//		System.out.println(e5);

		// SERIALIZATION
//		FileOutputStream fOut = new FileOutputStream(path);
//		ObjectOutputStream oOut = new ObjectOutputStream(fOut);
//		oOut.writeObject(e2);
//		oOut.flush();
//		oOut.close();

		// DESRIALIZATION
		FileInputStream fIS = new FileInputStream(path);
		ObjectInputStream oIS = new ObjectInputStream(fIS);
		EmployeeRecord e2 = (EmployeeRecord) oIS.readObject();
		System.out.println(e2);

	}

}
