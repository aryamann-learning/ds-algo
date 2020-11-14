package com.sorting;

public class PracticeMerge {
	public void mergeArrays(int[] left, int[] right, int[] outputArray) {
		int blueIndex = 0, redIndex = 0, greenIndex = 0;
		while (blueIndex < left.length && redIndex < right.length)
		{
			if (left[blueIndex] < right[redIndex]) {
				outputArray[greenIndex] = left[blueIndex];
				blueIndex++;
			} else {
				outputArray[greenIndex] = right[redIndex];
				redIndex++;
			}
			greenIndex++;
		}
		while (redIndex < right.length) {
			outputArray[greenIndex] = right[redIndex];
			redIndex++;
			greenIndex++;
		}
		while (blueIndex < left.length) {
			outputArray[greenIndex] = left[blueIndex];
			blueIndex++;
			greenIndex++;
		}
	}

	public void mergeSort(int[] arr) {
		int mid = 0;
		if (arr.length < 2)
			return;
		mid = arr.length / 2;
		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];
		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		for (int j = mid; j < arr.length; j++) {
			right[j - mid] = arr[j];
		}
		mergeSort(left);
		mergeSort(right);
		mergeArrays(left, right, arr);
	}

	public static void main(String[] args) {
		int[] arr = { 34, 53, 1, 3, 45, 2, 13, 17, 59, 88 };
		PracticeMerge mergeSortingObj = new PracticeMerge();
		mergeSortingObj.mergeSort(arr);
		for (int element : arr) {
			System.out.print(element + " ");
		}
	}

}
