package com.java8.oops.constructors;

public class Main {

	public static void main(String[] args) {
//
//		Employee e1 = new Employee();
//		System.out.println(e1);

		Employee e2 = new Employee("Jacob", 2, 99899896);
		Employee e3 = new Employee(e2);
//		Employee e2 = new Employee();

		System.out.println(e2);

	}

}
