package com.java8.oops.inheritance;

public class Main {

	public static void main(String[] args) {
		short goals = 200;
//		PlayerOfFIFA_A p1 = new PlayerOfFIFA_A("Ronaldo ", 7, 5.8f, "Striker", goals);
//
//		System.out.println(p1);

		PlayerOfFIFA_B p2 = new PlayerOfFIFA_B("Messi", 5, 56, 7, "Argentina", "Striker", goals);
		System.out.println(p2);

	}

}
