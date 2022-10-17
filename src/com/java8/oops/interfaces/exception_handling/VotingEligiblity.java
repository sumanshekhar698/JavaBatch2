package com.java8.oops.interfaces.exception_handling;

public class VotingEligiblity {

	public static void main(String[] args) {
		System.out.println("START");

		int age = 5;
		try {
			validate(age);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("END");

	}

	static void validate(int age) throws InvalidAgeException {
		if (age <= 18)
			throw new InvalidAgeException("Invalid AGE, Grow up first");
		else
			System.out.println("ELIGIBLE !!");
	}

}

class InvalidAgeException extends Exception {

	public InvalidAgeException(String message) {
		super(message);
	}

}
