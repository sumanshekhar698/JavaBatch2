package com.java8.concurrency.multithreading;

public class Main {
	public static final int MIN_PRIORITY = 1;
	public static final int NORM_PRIORITY = 5;
	public static final int MAX_PRIORITY = 10;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("START");

		CustomThread c1 = new CustomThread();
		CustomThread c2 = new CustomThread();
		CustomThread c3 = new CustomThread();
		c1.setName("VOODOO");
		c2.setName("ALPHA");
		c3.setName("BRAVO");

		Thread t1 = new Thread(new CustomThreadUsingRunnable());

		new Thread(new CustomThreadUsingRunnable()).start();

		new Thread(new CustomThreadUsingRunnable()).start();

		Thread t2UsingLambda = new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i + " --> " + Thread.currentThread());
			}
		});

		t2UsingLambda.setName("Lambda thread");
		t2UsingLambda.start();

		t1.setName("BETA");
		t1.start();
		t1.setPriority(10);
		c1.start();

		c2.start();
		c3.start();

//		Thread.sleep(3000);

		System.out.println(Thread.currentThread());
//		Thread.sleep(3000);

		System.out.println("END");

	}

}
