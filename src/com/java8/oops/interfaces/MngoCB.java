package com.java8.oops.interfaces;

public class MngoCB extends HTTPConnection implements ConnectToDB_v2, ConnectTodatabase{

	@Override
	public boolean pingTheDB(String ip) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean connectToDB() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String fetchQuery(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean dropTable() {
		// TODO Auto-generated method stub
		return false;
	}

}
