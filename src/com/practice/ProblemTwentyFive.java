/*Sort the half of the array in ascending order and the other half in descending orders
 Business Rule:if array size is negative store -1 into the array.*/

package com.practice;

import java.util.Scanner;

public class ProblemTwentyFive {
	public static void main(String[] args) {
		int n, temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements into array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		if (n < 0) {
			System.out.println("output=-1");
		} else if (n > 0) {
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (arr[i] > arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			for (int i = 0; i < n / 2; i++)
				System.out.print(arr[i] + " ");

			for (int i = n - 1; i >= n / 2; i--)
				System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
