package com.java8.oops.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainDMAT {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

//		DMATAccountDetails d1 = new DMATAccountDetails("FHGHJT", "JOHN", 786, 798);
		final String path = "C:\\Users\\suman\\eclipse-workspace\\YhillsJavaBactch2\\src\\resources\\EmployeeRecord.txt";

		// SERIALIZATION
//		FileOutputStream fOut = new FileOutputStream(path);
//		ObjectOutputStream oOut = new ObjectOutputStream(fOut);
//		oOut.writeObject(d1);
//		oOut.flush();
//		oOut.close();

		
		// DESRIALIZATION
		FileInputStream fIS = new FileInputStream(path);
		ObjectInputStream oIS = new ObjectInputStream(fIS);
		DMATAccountDetails s = (DMATAccountDetails) oIS.readObject();
		System.out.println(s);
	}

}
