package com.basicprograms;

import java.util.*;

public class AddTwoNumbers {
	public static void main(String[] args) {
		int num1, num2, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		num1 = sc.nextInt();
		System.out.println("enter second number");
		num2 = sc.nextInt();
		sc.close();
		sum = num1 + num2;
		System.out.println("sum of two numbers" + "= " + sum);

	}

}
