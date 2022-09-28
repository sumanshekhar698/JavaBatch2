package com.java8.oops.static_discussion;

//import com.java8.oops.basics.Employee;

public class MainPackageAmbiguityResolution {

	public static void main(String[] args) {

		com.java8.oops.basics.Employee e1 = new com.java8.oops.basics.Employee();
		Employee e2 = new Employee();

	}

}
