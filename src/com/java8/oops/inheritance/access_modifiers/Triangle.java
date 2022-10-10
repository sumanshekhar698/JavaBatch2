package com.java8.oops.inheritance.access_modifiers;

import com.java8.oops.inheritance.static_fusion.Data;

public class Triangle extends Shapes{
	
	int a;
	int b;
	int c;
	
	void printDimension() {
//		System.out.println(dimension);
//		dimesion=9;
		int dimension = getDimension();
		setDimension(66);
		
	}
	
//	@Override
//	public final void setDimension(int dimension) {//Specializes
//
//	}

}
