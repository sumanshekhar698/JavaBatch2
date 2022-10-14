package com.java8.oops.interfaces;

public class OracleDB implements ConnectTodatabase {

	@Override
	public boolean pingTheDB(String ip) {
		System.out.println("PING IS SUCCESS");
		return true;
	}

	@Override
	public boolean connectToDB() {
		// TODO Auto-generated method stub
		System.out.println("CONNECTION IS SUCCESS");

		return true;
	}

	@Override
	public String fetchQuery(String query) {
		System.out.println(x);
//		x=9;
		System.out.println(ConnectTodatabase.x);


		return "HELLO WORLD";
	}

}
