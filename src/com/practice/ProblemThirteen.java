/*Add the first element of the array input1 with the last element of the array input2
 Input3 is size of the array
 Input1[]={21,23,41,4}
 Input2[]={3,4,1,5}
 Input3=4;
 OUTPUT[]={26,24,45,7}
 BR
 1.Store -1 to the first position of the output array if any input array elements contains negative
 value
 2.Store -2 to the first position of the output array if array size is negative*/

package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemThirteen {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		 n = sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		int arr[] = new int[n];
		System.out.println("enter the first array elements");
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("enter the second array elments");
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}
		if (n < 0) {

			System.out.println("output=-2");
		} else {
			for (int i = 0; i < n; i++) {
				if (arr1[i] < 0 && arr2[i] < 0) {
					System.out.println("output=-1");
				} else if (n > 0) {
					for (i = 0; i < n; i++) {
						arr[i] = arr1[i] + arr2[n - 1 - i];
					}
					System.out.println("Output: " + Arrays.toString(arr));
				}
			}
		}
		sc.close();
	}
}
