/*Remove the repeated elements in the array
1) if any array element is negative, store -1 to the first position of the output array*/
package com.practice;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ProblemNinteen {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		if (n > 0) {
			int flag = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i] < 0) {
					flag = 1;
					System.out.println("output=-1");
				}
			}
			if (flag == 0) {
				LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(arr[n]);
				System.out.println("output" + set);
			}
		}
		sc.close();
	}
}
