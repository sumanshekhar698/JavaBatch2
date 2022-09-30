package com.java8.oops.static_concepts;

public class TeacherManagementAutomation {

	public static void main(String[] args) {

		int number = 3;
		Teacher[] teacherArray = new Teacher[number];
		for (int i = 0; i < number; i++) {
			teacherArray[i] = new Teacher(args[i]);
		}
		Teacher t1 = new Teacher("Angela");
		Teacher t2 = new Teacher("Miuchael");// emp1 emp2

//		System.out.println(t1);
//		System.out.println(t2);

		System.out.println(teacherArray[2]);

		System.out.println(Teacher.count);

	}

}
