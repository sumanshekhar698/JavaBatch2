package com.java8.oops.inheritance.inner_calsses;

import com.java8.oops.inheritance.inner_calsses.Outer.InnerTwo;

class Outer {

	class InnerOne {
		int m = 99;
		String s = "";

		void inerOneMethod() {
			System.out.println("inerOneMwthod()");
		}
	}

	class InnerTwo extends InnerOne {
//		class innerTwo extends Bramhos{

	}
}

public class OuterClassExample {

	public static void main(String[] args) {
		Outer o1 = new Outer();
		InnerTwo i2 = o1.new InnerTwo();
		i2.inerOneMethod();
	}

}
