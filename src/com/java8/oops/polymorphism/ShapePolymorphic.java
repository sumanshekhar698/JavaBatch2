package com.java8.oops.polymorphism;

public class ShapePolymorphic {

	// MethodOverloading
//	* no of paprams
//	* type of params
//	* position of params 

	// TODO Method Overiding
	void shape(double lengthOfSide) {
		System.out.println("SQUARE " + Math.pow(lengthOfSide, 2));
	}

	void shape(double base, double height) {
		System.out.println("TRIANGLE " + 0.5 * base * height);
	}

	void shape(int radius) {
		System.out.println("CIRCLE " + Math.pow(radius, 2) * Math.PI);
	}

	void shape(String shape, int dimension) {

		switch (shape) {
		case "sqr":
			System.out.println("SQUARE " + Math.pow(dimension, 2));
			break;
		case "circle":
			System.out.println("CIRCLE " + Math.pow(dimension, 2) * Math.PI);
			break;
		case "eqTriangle":
			System.out.println("eqTriangle " + Math.pow(3, 1 / 2) * dimension * dimension / 4);
			break;
		default:
			System.out.println("INVALID SHAPE !!");

			break;
		}
	}

	void shape(int dimension, String shape) {

		System.out.println("VOLUME of a" + shape + " " + 4 * Math.PI * Math.pow(dimension, 3) / 3);

	}

}
