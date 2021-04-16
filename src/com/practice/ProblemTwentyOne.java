/*From the given array find sum of multiples of 5 and calculate avg
Business Rule:
Store -1 into the output variable if any of the input element is negative
Store -2 into output variable if input2(array size)is negative value*/
package com.practice;

import java.util.Scanner;

public class ProblemTwentyOne {
	public static void main(String[] args) {
		int n, sum = 0, count = 0, average = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements into array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		if (n < 0) {
			System.out.println("output = -2");
		} else if (n > 0) {
			for (int i = 0; i < n; i++) {
				if (arr[i] < 0) {
					System.out.println("output = -1");
					break;
				} else if (arr[i] % 5 == 0) {
					sum = sum + arr[i];
					count++;
				}

			}
			System.out.println("sum of 5 multiples =" + sum);
			average = sum / count;
			System.out.println("Average of 5 multiples =" + average);

		}
		sc.close();
	}
}