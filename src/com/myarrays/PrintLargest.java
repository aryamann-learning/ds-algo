package com.myarrays;

public class PrintLargest {
	static void print3Largest(int arr[], int n) {
		int i, first, second, third;
		if (n < 3) {
			System.out.print("Invalid input");
			return;
		}
		third = first = second = Integer.MIN_VALUE;
		for (i = 0; i < n; i++) {
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			}

			else if (arr[i] > second) {
				third = second;
				second = arr[i];
			}

			else if (arr[i] > third)
				third = arr[i];
		}
		System.out.println("Three largest elements are " + first + " " + second + " " + third);
	}

	public static void main(String[] args) {
		int arr[] = { 12, 13, 1, 10, 34, 1 };
		int n = arr.length;
		print3Largest(arr, n);
	}
}
