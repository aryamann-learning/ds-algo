/*count the number of multiples of 3 in the given array
1) if any array element is negative, store -1 to output*/
package com.practice;

import java.util.Scanner;

public class ProblemEighteen {
	public static void main(String[] args) {
		int n, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				if (arr[i] < 0) {
					System.out.println("output=-1");
				} else if (arr[i] % 3 == 0) {
					count++;

				}
			}
			System.out.println("multiples of 3 : "+count);
		}
		sc.close();
	}
}
