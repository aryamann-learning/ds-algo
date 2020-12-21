package com.basicprograms;

import java.util.Scanner;

public class QuetientRemainder {
	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.close();
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		System.out.println("Quotient is: " + quotient);
		System.out.println("Remainder is: " + remainder);
	}
}
