package com.myarrays;

public class MajorityElement {

	static boolean isMajority(int arr[], int n, int x) {
		int i, last_index = 0;
		last_index = (n % 2 == 0) ? n / 2 : n / 2 + 1;

		for (i = 0; i < last_index; i++) {
			if (arr[i] == x && arr[i + n / 2] == x)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,4,2,3,3,3,3,3};
		int n = arr.length;
		int x = 3;
		if (isMajority(arr, n, x) == true)
			System.out.println(x + " appears more than " + n / 2 + " times in arr[]");
		else
			System.out.println(x + " does not appear more than " + n / 2 + " times in arr[]");
	}
}
