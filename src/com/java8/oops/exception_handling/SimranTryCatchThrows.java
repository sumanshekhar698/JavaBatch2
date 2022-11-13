package com.java8.oops.exception_handling;

public class SimranTryCatchThrows {

	public static void main(String[] args) throws InterruptedException, ArithmeticException {

		nap();
		nap2();
//		new SimranTryCatchVariations().nap();
	}

	static void nap() {
		try {
			Thread.sleep(1000);
			System.out.println(7 / 0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void nap2() throws ArithmeticException, InterruptedException {

		Thread.sleep(1000);
		try {
			System.out.println(6 / 0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
