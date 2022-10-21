package com.java8.oops.serialization;

public class OwnerRecord extends EmployeeRecord {

	int position;
	

	public OwnerRecord(int id, String name, int yearsOfService, int age, int position) {
		super(id, name, yearsOfService, age);
		this.position = position;
	}

}
