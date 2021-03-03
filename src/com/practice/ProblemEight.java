
/*Given an input array, if an element in an array is repeated most no of times store that
 element into an output array
 ex: input1{2,2,2,2,3,3,3,3,4} then output={2,3}
 input{2,2,2,3,3,4} then output={2}*/

package com.practice;

import java.util.Scanner;

public class ProblemEight {
	public static void main(String[] args) {
		int i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("number of  elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements");
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("repreated elements=" + arr[j]);
				}
			}
			sc.close();
		}
	}
}
