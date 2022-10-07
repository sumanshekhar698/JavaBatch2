package com.java8.oops.polymorphism;

public class ShapeNonPolymorphic {

	void calcAreaOfASquare(double lengthOfSide) {
		System.out.println(Math.pow(lengthOfSide, 2));
	}

	void calcAreaOfATriangle(double base, double height) {
		System.out.println(0.5 * base * height);
	}

	void calcAreaOfACircle(double radius) {
		System.out.println(Math.pow(radius, 2) * Math.PI);
	}

}
