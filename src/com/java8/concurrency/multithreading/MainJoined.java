package com.java8.concurrency.multithreading;

public class MainJoined {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("start");

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i + " --> " + Thread.currentThread());
			}
		});

		t1.start();
		t1.join();

		System.out.println("end");

	}

}
