/*Calculate the sum of positive elements in the given array. . Consider input1 is array elements 
 and input2 is array size.
Eg:
 Input1= {10,-5, 12, 47, 36, -24}
 Input2=6
 Output1=105
Business Rules:
i) If the array doesn‟t have any positive element store -1 to the output variable.
ii) If the array size (input2) is negative store -2 to the output variable.*/

package com.practice;

import java.util.Scanner;

public class ProblemThirtyOne {
	public static void main(String[] args) {
		int n, count = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements into array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		if (n < 0) {
			System.out.println("output=-2");
		} else if (n > 0) {
			for (int i = 0; i < n; i++) {
				if (arr[i] > 0) {
					count++;
				}
			}
		}
		if (count > 0) {
			for (int i = 0; i < n; i++) {
				if (arr[i] > 0) {
					sum = sum + arr[i];
				}
			}
			System.out.println("sum of positive numbers=" + sum);
		}else{
			System.out.println("output=-1");
		}
		sc.close();
	}
}
