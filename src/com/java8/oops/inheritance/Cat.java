package com.java8.oops.inheritance;

public class Cat extends Animal {

    String weight;
    String species = "default Cat";

    public Cat() {
//		super();
        System.out.println("Cat() called");
    }

    public Cat(String weight, String species) {
        super();
        System.out.println("CAT(weigght, string)");
        this.weight = weight;
        this.species = species;
    }

    void callOutSpecies(String species) {//Specialized
        System.out.println("CAT ----> " + this.species);

        animalIsEndangered();//inherited
    }


}
