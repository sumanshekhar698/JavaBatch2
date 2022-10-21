package com.java8.concurrency.multithreading;

public class CustomThread extends Thread {//is a

	@Override
	public void run() {

		super.run();
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + " --> " + Thread.currentThread());
		}
	}

}
