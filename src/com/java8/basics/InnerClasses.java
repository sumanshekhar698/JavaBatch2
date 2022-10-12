package com.java8.basics;

class OuterClass {
	int x;

	void methodOfOuterClass() {
		System.out.println("From OuterClass");
	}

	// Class as a member
	class InnerClass extends OuterClass {
		// only fields and methods are inherited, but not member Inner Classes
	}

	class InnerClassOne {
		// another class as a member
	}
}

public class InnerClasses {
	public static void main(String args[]) {
		OuterClass outer = new OuterClass();
		// You have to create OuterClass object to access non-static inner class

		OuterClass.InnerClass inner = outer.new InnerClass(); // creating object to InnerClass

		System.out.println(inner.x); // accesiing inherited field x

		inner.methodOfOuterClass(); // accessing inherited method
	}
}