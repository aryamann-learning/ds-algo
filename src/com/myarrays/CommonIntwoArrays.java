package com.myarrays;

import java.util.*;

public class CommonIntwoArrays {

	private static void FindCommonElemet(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					set.add(arr1[i]);
					break;
				}
			}
		}
		for (Integer i : set) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 9, 16, 25, 36, 49, 64, 81, 100 };

		int[] arr2 = { 100, 9, 64, 7, 36, 5, 16, 3, 4, 1 };

		System.out.println("Array 1: " + Arrays.toString(arr1));
		System.out.println("Array 2: " + Arrays.toString(arr2));
		FindCommonElemet(arr1, arr2);
	}
}