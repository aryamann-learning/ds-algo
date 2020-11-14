package com.sorting;

public class BobbleSort {
	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		BobbleSort obj = new BobbleSort();
		int arr[] = { 56, 35, 12, 21, 27, 14, 87, 6, 2, 1 };
		obj.bubbleSort(arr);
		System.out.println("Sorted array");
		obj.printArray(arr);
	}
}
