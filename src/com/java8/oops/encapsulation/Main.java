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

//		Inidan Citizen

		IndianCitizen i1 = new IndianCitizen();
//		i1.setfName("Kartik");
//		i1.setlName("Aryan");
//		i1.setAge(33);i1.setGender("male");

		i1.setAadHarNo(987879088).setfName("Kartik").setlName("Aryan").setAge(33).setGender("male").setPan("GNL987")
				.setHavingPassport(true);
		System.out.println(i1);
		
		

	}

}
