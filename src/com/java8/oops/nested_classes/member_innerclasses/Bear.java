package com.java8.oops.nested_classes.member_innerclasses;

public class Bear {// Outer Class

	String color;
	int height;
	boolean isDangerous;

	void callTheBear() {
		System.out.println("ARGHHHHH !");
		Cub cub = new Cub();
		cub.callTheBear();
	}

	private class Cub {// Inner class

		int age;
		String name;

		void callTheBear() {
			System.out.println("baby bear !");
		}

	}
	
	

}
