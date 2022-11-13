package com.java8.oops.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>(16, 0.75f);
		hashMap.put(1, "Jack");
		hashMap.put(2, "Jam");
		hashMap.put(10, "Jilll");
		hashMap.put(16, "Jame");
		hashMap.put(-1, "John");
		hashMap.put(null, null);

		System.out.println(hashMap);
		System.out.println(hashMap.get(10));

		hashMap.entrySet().stream().forEach(System.out::println);

		for (Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println(entry);
		}

	}

}
