package com.java8.oops.interfaces;

public interface ConnectTodatabase {

	int x = 10;// static and final implicitly

//	abstratc keyword is optional
	abstract boolean pingTheDB(String ip);

	boolean connectToDB();

	String fetchQuery(String query);

//	boolean dropTheTable();

	/*
	 * void whatIsTheDb(){
	 * 
	 * }
	 */

	default boolean truncateTheTable(String tableName) {// since JDK 8

		System.out.println("TRUNCATION IN PROGRESS");
		return false;

	}

	static boolean tabelDetails(String tableName) {// since JDK 8

		System.out.println("TABLE DEATILS : ------");
		return true;

	}

}
