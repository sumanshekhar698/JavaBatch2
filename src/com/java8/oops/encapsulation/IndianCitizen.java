package com.java8.oops.encapsulation;

public class IndianCitizen {

	private String fName;
	private String lName;
	private int age;
	private long aadHarNo;
	private String pan;
	private String gender;
	private boolean isHavingPassport;

	public String getfName() {
		return fName;
	}

	public IndianCitizen setfName(String fName) {
		this.fName = fName;
		return this;
	}

	public String getlName() {
		return lName;
	}

	public IndianCitizen setlName(String lName) {
		this.lName = lName;
		return this;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "IndianCitizen [fName=" + fName + ", lName=" + lName + ", age=" + age + ", aadHarNo=" + aadHarNo
				+ ", pan=" + pan + ", gender=" + gender + ", isHavingPassport=" + isHavingPassport + "]";
	}

	public IndianCitizen setAge(int age) {
		this.age = age;
		return this;
	}

	public long getAadHarNo() {
		return aadHarNo;
	}

	public IndianCitizen setAadHarNo(long aadHarNo) {
		this.aadHarNo = aadHarNo;
		return this;
	}

	public String getPan() {
		return pan;
	}

	public IndianCitizen setPan(String pan) {
		this.pan = pan;
		return this;

	}

	public String getGender() {
		return gender;
	}

	public IndianCitizen setGender(String gender) {
		this.gender = gender;
		return this;
	}

	public boolean isHavingPassport() {
		return isHavingPassport;
	}

	public IndianCitizen setHavingPassport(boolean isHavingPassport) {
		this.isHavingPassport = isHavingPassport;
		return this;
	}

}
