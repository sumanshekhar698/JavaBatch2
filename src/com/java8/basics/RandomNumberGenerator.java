package com.java8.basics;

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		double random = Math.random();// 0.0 to 1.0
		System.out.println(random);

		int threeDigitRandom = (int) (1000 * Math.random());// 0.0 to 1.0
		System.out.println(threeDigitRandom);

		int min = 89, max = 789;
		int randomRanged = (int) (min + Math.random() * (max - min + 1));// max in exclusive
		System.out.println(randomRanged);

		Random rand = new Random();
		int next = rand.nextInt(100);// 0-99

		rand.doubles();
		rand.ints();

	}
}
