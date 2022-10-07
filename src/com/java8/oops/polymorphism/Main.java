package com.java8.oops.polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShapeNonPolymorphic s1 = new ShapeNonPolymorphic();

		s1.calcAreaOfASquare(5.5);
		s1.calcAreaOfATriangle(5.5, 5.5);
		s1.calcAreaOfACircle(5.5);

		ShapePolymorphic sp1 = new ShapePolymorphic();

		sp1.shape(5, 5);
		sp1.shape(5);
		sp1.shape(5.0);
		sp1.shape("sqr", 5);
		sp1.shape(5, "Sphere");

	}

}
