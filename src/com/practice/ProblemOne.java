
/*1. Write a program to find sum of even numbers and odd numbers in an array and avg them
(ex: ar{1,2,3,4,5,6} output1=(12+9)/2
1) If any of the array element is negative store -1 into the output1 variable
2) If the size of an array is negative store -2 into the output1 variable*/
package com.practice;

public class ProblemOne {
	public static void main(String[] args) {
		int i, sum1 = 0, sum2 = 0;

		int arr[] = new int[] { 1, -2, 3 };
		if (arr.length <= 0) {
			System.out.println("output= -2");
		}
		for (i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				System.out.println("output1= -1");
				break;
			} else if (arr[i] % 2 != 0) {
				sum1 = sum1 + arr[i];
			} else {
				/* sum2 = arr[i]; */
				sum2 = sum2 + arr[i];
			}
		}
		double output1 = ((sum1 + sum2) / 2);
		System.out.println("average=" + output1);
	}

}
        
        
	



