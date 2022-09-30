package com.java8.oops.static_concepts;

import com.java8.oops.basics.Employee;

public class Student {

//	static denptes class level thing
	int id;
	static String name;
	static String college;// Class level thing
	static Employee employee;

	{

		System.out.println("Normal Block");
	}

	static {// maybe used to intiialize static variables
		college = "Coolege not set yet";
//		System.out.println(id);
		employee = new Employee();
		System.out.println("2nd static block");
	}

	static {
		System.out.println("1st static block");
	}

	public Student(int id, String name) {
//		super();
		System.out.println("Student constructo called");
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	static void attendance() {
		System.out.println(name + college);
		// Direct Accesing non static element inside a static context is banned
//		studentCount();
	}

	int studentCount() {
		System.out.println(name);
		attendance();
		return 0;

	}

}
