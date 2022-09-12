package com.java8.oops.basics;

import com.java8.basics.BasicPrimitiveDataTypes;

public class MouseMain {

	public static void main(String[] args) {

		Mouse m1 = new Mouse();// 1 object
		// m1 is ref variable pointing to our 1st Mouse Object
		// m1 is of type Mouse

		System.out.println(m1.hasTail);// false
		System.out.println(m1.color);// null
		m1.hasTail = true;
		System.out.println(m1.hasTail);// true

		BasicPrimitiveDataTypes basicPrimitiveDataTypes = new BasicPrimitiveDataTypes();
		String[] sa = new String[0];
		basicPrimitiveDataTypes.main(sa);
		Mouse m2 = new Mouse();// 1 object
//		 System.out.println(m2.hasTail);

	}

}
