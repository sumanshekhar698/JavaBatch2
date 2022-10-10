package com.java8.oops.inheritance.static_fusion;

public class Bramhos extends Missiles {

	String name = "B12";

	void brhmosSpecs() {// Specialized
//		super.getTheSpeed();
		Missiles.getTheSpeed();
		System.out.println(machSpeed);
	}

//	@Override
//	 void getTheSpeed() {
//		System.out.println(machSpeed);
//	}

}
