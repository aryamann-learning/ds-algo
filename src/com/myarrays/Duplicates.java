package com.myarrays;

import java.util.ArrayList;

public class Duplicates {
	static void findDuplicates(int arr[], int len) {
		boolean ifPresent = false;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					if (list.contains(arr[i])) {
						break;
					} else {
						list.add(arr[i]);
						ifPresent = true;
					}
				}
			}
		}
		if (ifPresent = true) {
			System.out.print(list + " ");
		} else {
			System.out.print(" no duplicates found in array");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 3, 3, 4, 5 };
		int len = arr.length;
		findDuplicates(arr, len);
	}

}
