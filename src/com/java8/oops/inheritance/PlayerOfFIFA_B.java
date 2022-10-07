package com.java8.oops.inheritance;

public class PlayerOfFIFA_B extends Player {

	String position;
	short goalsScored;
	

	public PlayerOfFIFA_B(String name, int height, int weight, int playerNum, String country, String position,
			short goalScored) {
		super(name, height, weight, playerNum, country);// interact with the immediate parent
		System.out.println("CHILD CONSTRUCTOR CALLED");
		this.position = position;
		this.goalsScored = goalScored;

	}

	@Override
	public String toString() {
		return "PlayerOfFIFA_B [position=" + position + ", goalsScored=" + goalsScored + ", name=" + name + ", height="
				+ height + ", weight=" + weight + ", playerNum=" + playerNum + ", country=" + country + "]";
	}
	
	

}
