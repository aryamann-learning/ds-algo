/*Given two arrays, compare two arrays and store the greater element of the arrays into output array.
Br:
1) If any of the element in an array is negative store -1 into first element of the output array
2) If the size of an array is negative then store -2 into the first element of the output array*/
package com.practice;

public class ProblemThree {
	public static void main(String[] args) {
		int i = 0, j = 0, k = 0;
		int arr1[] = { 4, 3, 2, 1 };
		int arr2[] = { 8, 7, 6, 5 };
		int a1 = arr1.length;
		int a2 = arr2.length;
		int c1 = a1 + a2;
		int arr[] = new int[c1];

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] > arr2[j]) {

				arr[k++] = arr1[i++];
			} else {
				arr[k++] = arr2[j++];
			}
		}

		while (i < arr1.length) {
			arr[k++] = arr1[i++];

		}
		while (j < arr2.length) {
			arr[k++] = arr2[j++];
		}
		for (k = 0; i < arr.length; k++) {
			System.out.println(arr[k] + " ");

		}

	}
}
