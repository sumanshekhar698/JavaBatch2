package com.java8.oops.encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FighterJet rafale = new FighterJet("Dasult Rafale", 1912, "AirDominance");

//		System.out.println(rafale.speedInKmph);// 1912
		System.out.println(rafale);
		rafale.setSpeedInKmph(2000);
		System.out.println(rafale.getSpeedInKmph());
		System.out.println(rafale.getCompanyName());
		System.out.println(rafale.getTypeOfJet());


	}

}
