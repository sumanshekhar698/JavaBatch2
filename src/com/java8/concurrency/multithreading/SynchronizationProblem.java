package com.java8.concurrency.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizationProblem {

	static volatile AtomicInteger a1 = new AtomicInteger(1);
//	volatile static int x = 1;

	public static void main(String[] args) throws InterruptedException {

		new Thread(() -> {
			a1.incrementAndGet();
		}).start();

		new Thread(() -> {
			a1.incrementAndGet();
		}).start();

		new Thread(() -> {
			a1.incrementAndGet();
		}).start();

		Thread.sleep(5);

		System.out.println(a1);

	}
}
