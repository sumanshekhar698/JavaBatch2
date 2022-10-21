package com.java8.concurrency.multithreading;

public class CustomThreadUsingRunnable implements Runnable {

	@Override
	public void run() {
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
