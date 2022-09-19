package com.java8.oops.basics;

public class EmployeeMain {
	Employee employee1;// instance variable

	public static void main(String[] args) {

//		local operation error
//		int x;
//		x++;//while incrementing it should be initialized\

//		var x =28;

		Employee e8;
		Employee e9 = null;
		e8 = e9;
		EmployeeMain eM = new EmployeeMain();
		System.out.println(eM.employee1);// null

		Employee e0;
		Employee e1 = new Employee();// 1 Object
		Employee e2 = null;
		e0 = new Employee();// 2nd Object
		Employee e3 = e0;
		System.out.println(e0);// com.java8.oops.basics.Employee@2a139a55
		System.out.println(e0.hashCode());// 705927765

		int points = e1.checkIn();
		System.out.println("E1 toStrting() " + e1.toString());// Error

		System.out.println(points);
		System.out.println(e1.attendance);// 1
		System.out.println(e0.attendance);// 0 All the instance variables are individual to its specific object
		System.out.println(e2);// null
		e0 = null;
		if (e0 != null)
			e0.checkIn();

//		R = 4
//		O =  2
//		G = 0

		System.gc();
	}
}
