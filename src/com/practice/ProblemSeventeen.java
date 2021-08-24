/*find the sum of cube of prime numbers upto n natural numbers(case study type)
1) if the limit(n) is negative, store -1 to output
2) if the n value is greater than 7, store -1 to output*/
package com.practice;

import java.util.Scanner;

public class ProblemSeventeen {
	public static void main(String[] args) {
		int n, sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array ");
		n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("enter the elements");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		// loop through the numbers one by one
		for (int i = 3; i < array.length; i++) {

			// check to see if the numbers are prime
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {

					continue;
				} else {

					sum = sum + (i * i * i);
				}
			}
			System.out.println("output" + sum);

		}
	}
}
