package com.java8.concurrency.multithreading;

public class VilatileExample {

	volatile static boolean flag = true;

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
//			int i = 0;
			while (flag) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("STOP ME IF YOU CAN !! ");

			}
		});

		Thread t2 = new Thread(() -> {
			try {
				Thread.sleep(5000);
				flag = false;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		t1.start();
		t2.start();

	}

}
