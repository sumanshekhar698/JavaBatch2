package com.java8.oops.collections;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<Integer>(10, 0.4f);

//		System.out.println(hashSet.);
		for (int i = 0; i < 10; i++) {
			hashSet.add(i * i);
		}

		System.out.println(hashSet);// Hashing
		boolean contains = hashSet.contains(9);// Searching ?
		System.out.println(contains);

//		System.out.println(hashSet.get);
//		Seacrhing , Getting elemebnnt SET

		for (Integer integer : hashSet) {
			System.out.println(integer);
		}

		hashSet.add(81);
		hashSet.add(25);
		System.out.println(hashSet);

		hashSet.stream().forEach(System.out::print);

	}
}
