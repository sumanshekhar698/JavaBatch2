package com.java8.oops.interfaces.marker;

public class Student implements Cloneable{

	int id;
	String name;
	long phoneNo;

	public Student(int id, String name, long phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();

	}

}
