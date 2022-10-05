package com.java8.oops.access_modifiers;

final public class AreaOfCircle {

	int radius;
	final double VALUE_OF_PI_Accurate = Math.PI;
	final double VALUE_OF_PI;

	public AreaOfCircle(int radius, double pi) {
//		super();
		this.radius = radius;
		this.VALUE_OF_PI = pi;
//		this.ans = 0;
	}

	public AreaOfCircle() {
		this.VALUE_OF_PI = 3.14159;
	}

	double calcArea() {
		double area = this.VALUE_OF_PI * this.radius * this.radius;
		return area;
	}

}
