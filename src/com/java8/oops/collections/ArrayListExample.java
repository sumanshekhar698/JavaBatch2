package com.java8.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

import com.java8.oops.basics.Employee;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(1);
		al.add("JAVA");
		al.add(new AtomicBoolean(true));
		al.add(new Employee());

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(1);
		al2.add(234);
		al2.add(3);
		al2.add(44);

		System.out.println(al2);

//		for (int i = 0; i < al2.size(); i++) {
//			System.out.println(al2.get(i));
//		}
//		
//		
//		for (Integer x : al2) {
//			System.out.print(x+" ");
//		}

//		for (int i = 0; i < al2.size(); i++) {
//			al2.add(i);
//		}

		ArrayList<Integer> al3 = new ArrayList<Integer>();

		for (Integer integer : al2) {
			al3.add(integer);
		}
		System.out.println(al3);

		System.out.println(al2.size());
		al2.addAll(al3);
		System.out.println(al2);

		al2.forEach(System.out::println);

		Collections.sort(al2);
		System.out.println(al2);

		Collections.shuffle(al2);
		System.out.println(al2);

		List<Integer> al2SQRED = al2.stream().filter(x -> x % 2 == 0).map(x -> x * x).collect(Collectors.toList());
		System.out.println(al2SQRED);

	}

}
