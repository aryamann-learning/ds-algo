package com.basicprograms;

import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		double p, r, t;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values");
		p = sc.nextDouble();
		r = sc.nextDouble();
		t = sc.nextDouble();
		sc.close();
		double CI = p * (Math.pow((1 + r / 100), t));

		System.out.println("Compound Interest is " + CI);
	}
}
