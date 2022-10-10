package com.java8.oops.inheritance;

public class Animal {

	String foodHabit;
	String nativePlace;
	String species = "default";
	boolean isEndangered;

	public Animal() {
//		super();
		System.out.println("Animal() called");
	}
	
	void animalIsEndangered(){
		System.out.println(isEndangered);
	}

}
