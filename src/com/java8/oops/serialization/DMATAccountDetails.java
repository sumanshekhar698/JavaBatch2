package com.java8.oops.serialization;

import java.io.Serializable;

public class DMATAccountDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	transient String panNumber;
	String name;
	int civilScore;
	int creditScore;

	public DMATAccountDetails(String panNumber, String name, int civilScore, int creditScore) {
		super();
		this.panNumber = panNumber;
		this.name = name;
		this.civilScore = civilScore;
		this.creditScore = creditScore;
	}

	@Override
	public String toString() {
		return "DMATAccountDetails [panNumber=" + panNumber + ", name=" + name + ", civilScore=" + civilScore
				+ ", creditScore=" + creditScore + "]";
	}

}
