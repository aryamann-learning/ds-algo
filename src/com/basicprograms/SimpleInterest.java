package com.basicprograms;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		int p, t, r, si;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values");
		p = sc.nextInt();
		t = sc.nextInt();
		r = sc.nextInt();
		sc.close();
		si = (p * t * r) / 100;
		System.out.println("simple interest is" + " " + si);
	}

}
