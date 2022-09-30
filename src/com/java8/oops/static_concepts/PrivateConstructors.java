package com.java8.oops.static_concepts;

public class PrivateConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		RBI bank = RBI.getInstance(5.4f);
		System.out.println(bank);
		RBI bank3 = RBI.getInstance(5.4f);
		RBI bank4 = RBI.getInstance(5.4f);
		RBI bank5 = RBI.getInstance(5.4f);
		RBI bank6 = RBI.getInstance(5.4f);
		RBI bank9 = RBI.getInstance(5.4f);
		RBI bank0 = RBI.getInstance(5.4f);
		
		System.out.println(bank5);

	}

}
