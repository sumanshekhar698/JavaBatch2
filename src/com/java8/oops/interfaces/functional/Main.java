package com.java8.oops.interfaces.functional;

public class Main {

	public static void main(String[] args) {

		int x = 7;
		Connection connection = new Connection() {
			@Override
			public boolean connect() {
				System.out.println("CONNECTED" + x);
				return false;
			}
		};
		boolean connect = connection.connect();
		System.out.println(connect);
		

//		Lambda Fn --> Functionl Interface
		Connection con2 = () -> {
			System.out.println("CONNECTED" + x);
			return true;
		};
		
		boolean connect2 = con2.connect();
		System.out.println(connect2);
		
//		Runnable ---< MT
		
//		Throwable
//		Clonnable
		

	}

}
