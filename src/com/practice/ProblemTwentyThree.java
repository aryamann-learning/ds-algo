/*search the given input and Count how many times it repeating from the given array
Eg:
Input1-{1,2,2,3,3}
Input2-5
Input3-2
Output-2
Business Rule:
Store -1 into output variable if any of the array value is negative
Store -2 into output variable if input2(array size) is negative
Store -3 into output variable if input3(Search value) is negative*/
package com.practice;

import java.util.Scanner;

public class ProblemTwentyThree {
	public static void main(String[] args) {
		int n, k = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the numbers into array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the k value ");
		k = sc.nextInt();
		if (n < 0) {
			System.out.println("output=-2");	
		}else if(k < 0){
			System.out.println("output=-3");
		} else if (n > 0) {
			for (int i = 0; i < n; i++) {
				if (arr[i] < 0) {
					System.out.println("output=-1");
				} else {
					if (k == arr[i]) {
						count++;
					}
				}
			}
			System.out.println("output =" + count);
		}
		sc.close();
	}
}
