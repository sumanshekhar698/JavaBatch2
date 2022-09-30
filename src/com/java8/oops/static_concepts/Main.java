package com.java8.oops.static_concepts;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student(1, "Andy");
		System.out.println(s1);
		System.out.println(s1.college);// not a good practice
		Student.college = "IIT Bomaby";
		System.out.println(Student.college);

//		Student.college = "IIT Bomaby";

		Student s2 = new Student(2, "Bryan");
		System.out.println(s2);

		System.out.println(Student.college);// Static entities should be access via class not via object ref
		System.out.println(s1);

	}

}
