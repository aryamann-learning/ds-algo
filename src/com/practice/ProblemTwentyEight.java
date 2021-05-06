/*sum of squres of odd digits in a number.
 Business Rule:if input1< 0, store -1 into the output variable*/
package com.practice;

import java.util.Scanner;

public class ProblemTwentyEight {
	public static void main(String[] args) {
		int n, odd = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		n = sc.nextInt();
		if (n <= 0) {
			System.out.println("output=-1");
		} else {
			while (n > 0) {
				odd = n % 10;
				if (odd % 2 != 0) {
					sum = sum + (odd * odd);
				}
				n /= 10;
			}
			System.out.println("output =" + sum);
		}
		sc.close();
	}
}
