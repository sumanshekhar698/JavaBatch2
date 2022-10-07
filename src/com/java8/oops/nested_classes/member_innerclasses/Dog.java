package com.java8.oops.nested_classes.member_innerclasses;

public class Dog {

	String species;
	boolean isDangerous;
	String countryOforigin;

	static private class Puppy {
		String name;
		int age;

		void callThePuppy() {
			System.out.println("PAWWW !!");
			System.out.println(this);
			return;
		}

		@Override
		public String toString() {
			return "Puppy [name=" + name + ", age=" + age + "]";
		}

	}

	public static void main(String[] args) {
//		Dog d1 = new Dog();
//		Puppy p1 = d1.new Puppy();

		Puppy p1 = new Puppy();

//		p1.age = 4;
//		p1.name = "tin tin";
		p1.callThePuppy();
		System.out.println(p1);

	}

}
