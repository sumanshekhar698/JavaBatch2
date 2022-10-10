package com.java8.oops.inheritance;

public class PlayerOfFIFA_A {

	String playerName;
	int playerNum;
	float height;
	String position;
	short goalsScored;

	public PlayerOfFIFA_A(String playerName, int playerNum, float height, String position, short goalsScored) {
		super();
		this.playerName = playerName;
		this.playerNum = playerNum;
		this.height = height;
		this.position = position;
		this.goalsScored = goalsScored;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", playerNum=" + playerNum + ", height=" + height + ", position="
				+ position + ", goalsScored=" + goalsScored + "]";
	}
}
