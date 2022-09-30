package com.java8.oops.constructors;

//Singelton Design Patern
public class Animal {

//	private instanc var/methods cannot be accessed outside their class
	String species;
	String nativePlace;
	Diet diet;

	 Animal(String species, String nativePlace, Diet diet) {

		super();

		this.species = species;
		this.nativePlace = nativePlace;
		this.diet = diet;

	}

}

//static