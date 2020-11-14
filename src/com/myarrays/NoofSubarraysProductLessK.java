package com.myarrays;

public class NoofSubarraysProductLessK {
	static int numberOfArray(int arr[], int N, int k) {
		int  mul;
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (arr[i] < k)
				count++;
			mul = arr[i];
			for (int j = i + 1; j < N; j++) {
				mul = mul * arr[j];
				if (mul < k)
					count++;
				else
					break;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int k = 7;
		int arr[] = { 1, 2, 3, 4 };
		int size = arr.length;
		int count = numberOfArray(arr, size, k);
		System.out.println(count);
	}
}
