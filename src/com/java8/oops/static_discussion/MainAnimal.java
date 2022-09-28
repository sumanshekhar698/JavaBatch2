package com.java8.oops.static_discussion;

import com.java8.oops.arrays.BinarySearch;

public class MainAnimal {

	public static void main(String[] args) {
		
//		BinarySearch bs = new BinarySearch();
//		System.out.println(bs.y);
		
		System.out.println(BinarySearch.y);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.PI);

		Animal rhino = new Animal("Rhinocores", "Assam", Diet.Herbivores);
		Animal tiger = new Animal("Sunderban Tiger", "WB", Diet.Carnivores);

	}
	


}
