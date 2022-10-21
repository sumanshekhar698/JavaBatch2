package com.java8.oops.serialization;

import java.io.Serializable;

public class School implements Serializable {

	String name;
	String branch;
	static String board = "ICSE";

	public School(String name, String branch) {
		super();
		this.name = name;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", branch=" + branch + "]";
	}

}
