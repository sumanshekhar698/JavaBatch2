package com.java8.oops.serialization;

import java.util.Collections;
import java.util.PriorityQueue;

public class Question {

	public static void main(String[] args) {
		int x = 13, y = 10;
		int result = greatestInteger(x, y);
		System.out.println(result);
	}

	private static int greatestInteger(int x, int y) {
		// Write your code from here
		if (x <= y)
			return x;

		StringBuffer sb = new StringBuffer(Integer.toBinaryString(x));
		boolean flag = false;
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>((a, b) -> b - a);

		for (int j = 0; j < sb.length(); j++) {
			flag = false;
			if (sb.charAt(j) == '1') {
				sb.replace(j, j + 1, "0");
				flag = true;
			}
			x = Integer.parseInt(sb.toString(), 2);

			if (flag) {
				if (x < y)
					pQueue.add(x);
				sb.replace(j, j + 1, "1");
			}
		}

		return (pQueue.isEmpty()) ? 0 : pQueue.poll();
	}

}
