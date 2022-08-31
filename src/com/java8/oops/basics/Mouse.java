package com.java8.oops.basics;

//Designing
//Protyping
public class Mouse {
	
	//BluePrint of Mouse

	// Any variable which is declared inside a class and outside a method is called an Instance Variable
	// They are strictly object specific

	int noOfLegs;//0
	int noOfEyes;//0
	boolean hasTail;//false
	String color;//null
	String species;//null
	


	// Anatomy of a method
	// methods can or cannot be object specific

	void eat() {
		System.out.println(species + " is eating");
	}

	void sleep() {
		System.out.println(species + " is sleeping");
	}

}
