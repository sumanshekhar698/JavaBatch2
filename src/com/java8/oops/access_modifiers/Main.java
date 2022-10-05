package com.java8.oops.access_modifiers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AreaOfCircle areaOfCircle = new AreaOfCircle(17, Math.PI);
		double calcArea = areaOfCircle.calcArea();
		System.out.println(calcArea);

		
//		x is local
		final int x ;//declared
		x= 99;//intializing
//		x=9;
		
//		areaOfCircle.pi = 22 / 7;
		calcArea = areaOfCircle.calcArea();
		System.out.println(calcArea);

	}

}
