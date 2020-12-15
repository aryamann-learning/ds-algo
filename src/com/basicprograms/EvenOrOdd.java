package com.basicprograms;

import java.util.*;

public class EvenOrOdd {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num = sc.nextInt();
		sc.close();
		if (num % 2 == 0) {
			System.out.println("given number is even");
		} else {
			System.out.println("given number is odd");

		}

	}

}
