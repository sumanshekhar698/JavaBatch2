package com.java8.oops.interfaces;

public class Main {

	public static void main(String[] args) {
		AstroDB db = new AstroDB();
		
		
		
		
		boolean connectToDB = db.connectToDB();
		System.out.println(connectToDB);
		
		
		ConnectTodatabase cDB = new ConnectTodatabase() {
			
			@Override
			public boolean pingTheDB(String ip) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String fetchQuery(String query) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean connectToDB() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		
		
		
		
	}
}
