/*First element of the array is replaced with last element of the array.Input2 is the array size.
 For example
 Input1[]={12,34,56,17,2}
 Input2=5
 Output1[]={2,17,56,34,12}
 Take mid=input2/2;
 BR
 1.If array contain any negative elements store -1 to the first position of the output array
 2.Store -2 if the given array size is negative
 3.Store -3 to the first position of the output array if the given array size is even*/
package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemTwelve {
	public static void main(String[] args) {
		int i, temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements of array");
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		if (n <= 0) {

			System.out.println("output=-2");
		} else if (n > 0) {
			for (i = 0; i < n; i++) {
				if (arr[i] < 0) {
					System.out.println("output=-1");
				}
			}
		}
		for (i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}

		System.out.println("Output: " + Arrays.toString(arr));
		sc.close();
	}
}
