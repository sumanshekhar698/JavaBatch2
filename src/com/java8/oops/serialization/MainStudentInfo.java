package com.java8.oops.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class MainStudentInfo {
	final String path = "C:\\Users\\suman\\eclipse-workspace\\YhillsJavaBactch2\\src\\resources\\EmployeeRecord.txt";

	public static void main(String[] args) throws Exception {
		MainStudentInfo stf = new MainStudentInfo();
//		stf.fWrite(); // for Writing objects into file
		stf.fRead(); // Reading objects from file
	}

	public void fWrite() throws Exception {
		StudentdInfo info1, info2;

		info1 = new StudentdInfo();
		info1.setSno(1);
		info1.setSname(new String("AAA"));
		info1.setSdate(new Date());

		info2 = new StudentdInfo();
		info2.setSno(2);
		info2.setSname(new String("BBB"));
		info2.setSdate(new Date());

		FileOutputStream fout = new FileOutputStream(new File(path));
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(info1);
		oos.writeObject(info2);
		oos.close();
		fout.close();
	}

	public void fRead() throws Exception {
		StudentdInfo info;
		FileInputStream fis = new FileInputStream(new File(path));
		ObjectInputStream ois = new ObjectInputStream(fis);
		info = (StudentdInfo) ois.readObject();
		System.out.println(info);
		info = (StudentdInfo) ois.readObject();
		System.out.println(info);
	}
}