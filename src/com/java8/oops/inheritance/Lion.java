package com.java8.oops.inheritance;

public class Lion extends Cat {

	String place;
	String species = "Asiatic";

	public Lion() {
//		super();
		this("While Lion");
//		super("55", "Egyptian Cat");
		System.out.println(this.place);

		System.out.println("Lion() called");
	}
	
	public Lion(String lion) {
		super();
		System.out.println("Lion(String) called");
	}

	@Override
	void callOutSpecies(String species) {//Overridden Method
		System.out.println(species);
		System.out.println(this.species);
		System.out.println(super.species);
//		System.out.println(super.super.species);//super can be used top access direct Parent only
		super.callOutSpecies(species);
//		this.callOutSpecies(species);//recursion
//		callOutSpecies(species);//recursion

	}
}
