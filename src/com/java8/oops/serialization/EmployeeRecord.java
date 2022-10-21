package com.java8.oops.serialization;

import java.io.Serializable;

public class EmployeeRecord implements Serializable {

	int id;
	String name;
	int yearsOfService;
	BankAccount ba = new BankAccount("ICICI", "IC7997n");// has-A relation

	int age;

	@Override
	public String toString() {
		return "EmployeeRecord [id=" + id + ", name=" + name + ", yearsOfService=" + yearsOfService + ", ba=" + ba
				+ ", age=" + age + "]";
	}

	public EmployeeRecord(int id, String name, int yearsOfService, int age) {
		super();
		this.id = id;
		this.name = name;
		this.yearsOfService = yearsOfService;
		this.age = age;
	}

}
