package com.java8.oops.inheritance;

public class Player  {

	String name;
	int height;
	int weight;
	int playerNum;
	String country;
	
	
	public Player(String name, int height, int weight, int playerNum, String country) {
		super();
		System.out.println("Parent constructor called");

		this.name = name;
		this.height = height;
		this.weight = weight;
		this.playerNum = playerNum;
		this.country = country;
	}

}
