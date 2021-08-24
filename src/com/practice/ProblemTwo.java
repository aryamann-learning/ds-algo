/*Given two input arrays, sort first array into ascending order and second array into descending order


And multiply the first element of first array with last element of second array and second element of first array with second last of the second
array and so on……………………..
(ex:
Input1{1,2,3,4,5} and input2={9,8,7,6,5} and output1{5,12,21,32,45}
Br:
1) If any element of input arrays is negative store -1 into the first element of the output array
2) If size of an array is negative store -2 into the first element of the output array*/
package com.practice;

import java.util.Arrays;

public class ProblemTwo {
	public static void main(String[] args) {
		int i = 0;
		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 6, 7, 5 };
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (arr1.length <= 0 || arr2.length <= 0) {
			int arr[] = new int[] { -2 };
			System.out.println(arr[i]);
		}
		for (i = 0; i < arr1.length; i++) {
			if (arr1[i] < 0 || arr2[i] < 0) {
				int arr[] = new int[] { -1 };
				System.out.println(arr[i]);
				break;
			} else {
				String output1 = " ";
				for (i = 0; i < arr1.length; i++) {
					int num1 = arr1[i];
					int num2 = arr2[i];

					output1 += Integer.toString(num1 * num2) + " ";

				}
				System.out.println("\nOutput=" + output1);

			}
		}
	}
}
