package com.java8.basics;

public class BasicOperators {

	public static void main(String[] args) {

//		Assignment Operator
		int x = 89;

//		Unary Operators
		x++;// post increment
		System.out.println(x);

		x--;// post decrement
		System.out.println(x);

//		Shorthand Operators
		x += 2;// x = x +2
		System.out.println(x);

		x *= 2;
		System.out.println(x);

		int y = x % 10;
		System.out.println(y);

//		Questions
		int num = 78;
//		System.out.println(num++);
		System.out.println(++num);

		System.out.println(num);

		num = 100;
//		System.out.println(--num);
//		System.out.println(num--);
//		System.out.println(num);

		num = ++num - --num - num++ + ++num - num++;
		System.out.println(num);// -99

		byte litresOfPetrol = Byte.MAX_VALUE;// 127
		litresOfPetrol += 2;//
		System.out.println(litresOfPetrol);// -127
		litresOfPetrol += 2;
		System.out.println(litresOfPetrol);// -125

//		System.out.println(num1/0);//Runtime Error
		litresOfPetrol = Byte.MIN_VALUE;
		System.out.println(--litresOfPetrol);

		// Comparison operators == != > < >= <=
		if (num != y)
			System.out.println(true);
		else
			System.out.println(false);

//		BitWise Operators

		int example = 7;
		example = 7 << 3;// *2 //left shift
		example = 8 >> 1;// right shift
		System.out.println(example);
		System.out.println(7 & 65);// bitwise and
		System.out.println(7 | 65);// bitwise or
		System.out.println(7 ^ 65);// xor
		System.out.println(~7);// bitwise not

	}

}
