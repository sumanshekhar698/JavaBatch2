package com.java8.oops.arrays;

public class XORNumberMiising {

	public static void main(String[] args) {

		int[] num1 = { 6, 7, 8, 33, 9, 44, 7, Integer.MAX_VALUE };
		int[] num2 = { 6, 7,  33, 44, 7 ,8, 9};
		
//		Sol 1
//		O(n)
		int sum1 =0;
		for (int i = 0; i < num1.length; i++) {
			sum1+=num1[i];
		}
		
		int sum2 =0;
		for (int i = 0; i < num2.length; i++) {
			sum2+=num2[i];
		}
		
		
		System.out.println(sum1-sum2);
		
//		Sol 2 XOR
//		O(n)
		int calc=0;
		for (int i = 0; i < num1.length; i++) {
			calc=calc^num1[i];
		}
		

		for (int i = 0; i < num2.length; i++) {
			calc=calc^num2[i];
		}
		
		System.out.println(calc);
		

	}

}
