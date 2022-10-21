package com.java8.oops.serialization;

import java.io.Serializable;

public class BankAccount implements Serializable{

	String nameOfBank;
	String IFSCode;

	public BankAccount(String nameOfBank, String iFSCode) {
		super();
		this.nameOfBank = nameOfBank;
		IFSCode = iFSCode;
	}

	@Override
	public String toString() {
		return "BankAccount [nameOfBank=" + nameOfBank + ", IFSCode=" + IFSCode + "]";
	}

}
