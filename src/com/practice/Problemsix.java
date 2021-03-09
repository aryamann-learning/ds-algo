/*  Write a program to find the sum of the even digits in a given number
 
1) If number is negative store -1 into the output variable
2) If number is greater than 32767 store -2 into the output variable*/
package com.practice;

import java.util.Scanner;

public class Problemsix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		if (n < 0) {
			System.out.println("output=-1");
		} else if (n > 32767) {
			System.out.println("output=-2");
		} else if (n > 0 && n < 32767) {
			int output = 0;
			int a = 0;
			while (n > 0) {
				a = n % 10;

				if (a % 2 == 0) {
					output = output + a;
				}
				n = n / 10;

			}
			System.out.println("sum of even digits=" + output);

		}
		sc.close();
	}
}
