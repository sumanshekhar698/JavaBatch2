package com.java8.oops.basics;

public class Employee {

//	Instance Variables
//	Declaration
//	Instance Variables are specific to their Objects/Instance
//	Instance Variable are Global in scope

//	null is the default value for every non Primitive data type

	String name;// null
	String companyName;// null

//	the below 2 are not Objects | Primitive data Type
	int attendance;// 0
	long empId;// 0

//	boolean = false
//	float = 0.0

	int checkIn() {
		int attendance = 0;// local varible to checkIn()
		System.out.println("Checked In" + System.currentTimeMillis());// Logging
		attendance++;
		this.attendance++;
		checkMails();
		checkTeams();
		return 10;//10 Point for single attendance
//		return 1;

	}

	void checkMails() {
		System.out.println("Mail Checked");
	}

	void checkTeams() {
		System.out.println("TEAMS checked for mwwting");
	}

}
