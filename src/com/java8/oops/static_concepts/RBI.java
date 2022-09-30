package com.java8.oops.static_concepts;

//		Singelton Pattern
public class RBI {

	float repoRate;
	static boolean isMade = false;
	static RBI bank;

	private RBI(float repoRate) {
		super();
		this.repoRate = repoRate;
	}

	static RBI getInstance(float repoRate) {

		if (!isMade) {
			bank = new RBI(repoRate);
			isMade = true;
		}

		return bank;
	}

}
