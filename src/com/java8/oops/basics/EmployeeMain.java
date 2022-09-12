package com.java8.oops.basics;

public class EmployeeMain {

	public static void main(String[] args) {

//		local operation error
//		int x;
//		x++;//while incrementing it should be initialized

		Employee e0;
		Employee e1 = new Employee();// 1 Object
		Employee e2 = null;
		Employee e3;
		e0 = new Employee();// 2nd Object

		int points = e1.checkIn();
		System.out.println(points);
		System.out.println(e1.attendance);// 1
		System.out.println(e0.attendance);// 0 All the instance variables are individual to its specific object
		System.out.println(e2);// null

	}

}
