package com.java8.basics;

public class BasicOperators {

	public static void main(String[] args) {

//		Assignment Operator
		int x = 89;// R -> L

//		Unary Operators
		x++;// post increment
		System.out.println(x);// 90

		x--;// post decrement
		System.out.println(x);// 89

//		Shorthand Operators
		x += 2;// x = x +2
		System.out.println(x);

		x *= 2;
		System.out.println(x);

		int y = x % 10;
		System.out.println(y);

//		Questions
		int num = 78;
		System.out.println(num++);// 78
		// 79
		System.out.println(++num);// 80

//		System.out.println(num);

		num = 100;
		System.out.println(--num);// 99
		System.out.println(num--);// 99
		System.out.println(num);// 98
		num = 25;

//		num = 101
		num = ++num - --num - num++ + ++num - num++;// -97
		System.out.println(num);// -97

		byte litresOfPetrol = Byte.MAX_VALUE;// 127
		litresOfPetrol += 2;//
		System.out.println(litresOfPetrol);// -127

//		-128			127
		litresOfPetrol += 2;
		System.out.println(litresOfPetrol);// -125

//		System.out.println(num1/0);//Runtime Error
		litresOfPetrol = Byte.MIN_VALUE;// -128
		System.out.println(litresOfPetrol--);// -128
		System.out.println(litresOfPetrol);// 127

		// Comparison operators == != > < >= <=
		num = 19;
		y = 18;
		if (num != y) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

//		BitWise Operators
//		DSA
		int example = 7;
		example = 7 << 3;// *2 //left shift 7*2*2*2 = 56
		System.out.println(example);
		example = 8 >> 1;// right shift 8  /2 
		System.out.println(example);//4
		
		
		System.out.println(7 & 65);// bitwise and
		System.out.println(7 | 65);// bitwise or
		System.out.println(7 ^ 65);// xor
		System.out.println(~7);// bitwise not

	}

}
