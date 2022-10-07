package com.java8.oops.nested_classes.member_innerclasses;

public class Bear {// Outer Class

	String color;
	int height;
	boolean isDangerous;

	Cub callTheBear() {
		System.out.println("ARGHHHHH !");
		Cub cub = new Cub();
		cub.callTheBear();
		return cub;
	}

	// private entities cannot be called outside the class
	private class Cub {// Inner class

		int age;
		String name;

		void callTheBear() {
			System.out.println("baby bear !");
		}

	}

}
