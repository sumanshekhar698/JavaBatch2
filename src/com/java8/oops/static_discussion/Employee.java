package com.java8.oops.static_discussion;

public class Employee {

	// instance vars are Object specific
	String name;
	int id;
	long phoneNo;

	// A constructor is a specialized method, with same name as of class
	// It has no return type
	// You cannot call it explicitly
	// It will be automatically called while creating Object
	// Atleast 1 constructor will always be present

//	Case 1 : You are not declaring , 1 constructor added by jvm
	// Case 2: you are declaring 1 constructor, 1 constructor

	// Parameterless Constructor
	Employee() {
//		this(this);
		System.out.println("Employee() const called");

	}

	Employee(String name) {
		this();
		System.out.println("Employee(name) const called");

	}

	Employee(Employee e) {
		System.out.println("Employee(name) const called");
	}

	// Parameter Constructor
	Employee(String name, int id, long phoneNo) {
//		super();
		this(name);// constructor chaining should always be 1st statement
		System.out.println("Employee(name,id,phoneNo) const called");

		this.name = name;// Shadow problem
		this.id = id;
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {// gets automatically called when you try to print ref
		return "Employee [name=" + name + ", id=" + id + ", phoneNo=" + phoneNo + "]";
	}

	void checkIn() {
//		Employee();

	}

}
