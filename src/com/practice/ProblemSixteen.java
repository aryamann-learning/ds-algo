/* Check whether the given number is perfect or not
1) if the number is perfect number, store 1 to output
2) If the number is not negative, store -1 to output
3) If the number is negative, store -2 to output*/
package com.practice;

import java.util.Scanner;

public class ProblemSixteen {
	public static void main(String[] args) {
		int x, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		x = sc.nextInt();
		if (x < 0) {
			System.out.println("output=-2");
		} else if (x > 0) {
			System.out.println("Given number is not negetive,output=-1");
			System.out.println("Divisors of " + x);
			for (int i = 1; i < x; i++) {
				if (x % i == 0) {
					System.out.println(i);
					sum = sum + i;
				}
			}
			if (sum == x) {
				System.out.println("Given number is perfect output=1");
			} else {
				System.out.println("given number is not perfect");
			}
		}
		sc.close();
	}
}
