/*Remove the negative elements from array and sort the remaining elements
 Business Rule:if array size is negative store -1 into the array.*/
package com.practice;

import java.util.Scanner;

public class ProblemTwentyFour {
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
			System.out.println("output = -1");
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
				System.out.print("Array after sort:");
				for (int i = 0; i < n - 1; i++) {
					if (arr[i] < 0) {
						continue;
					} else {
						System.out.print(arr[i] + ",");
					}
				}
				System.out.print(arr[n - 1]);
			}
			sc.close();
		}
	}

