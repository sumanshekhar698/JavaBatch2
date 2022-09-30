package com.java8.oops.static_concepts;

public class Teacher {

	String id;
	String name;
	static int count = 0;

	public Teacher(String name) {
		this.name = name;
		this.id = "emp" + ++count;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}

}
