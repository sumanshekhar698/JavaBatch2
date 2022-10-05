package com.java8.oops.encapsulation;

public class FighterJet {

	private String companyName;
	private int speedInKmph;
	private String typeOfJet;

	public FighterJet(String companyName, int speedInMach, String typeOfJet) {
		super();
		this.companyName = companyName;
		this.speedInKmph = speedInMach;
		this.typeOfJet = typeOfJet;
	}

	public int getSpeedInKmph() {// read acces
		return speedInKmph;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getTypeOfJet() {
		return typeOfJet;
	}

	public void setSpeedInKmph(int speedInKmph) {// write access
		this.speedInKmph = speedInKmph;
	}

	@Override
	public String toString() {
		return "FighterJet [companyName=" + companyName + ", speedInKmph=" + speedInKmph + ", typeOfJet=" + typeOfJet
				+ "]";
	}
	


}
