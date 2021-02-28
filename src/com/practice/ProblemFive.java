package com.practice;
/*Write a program to multiply the positive numbers in an array

1) If the size of an array is negative store -2 into the output variable*/

public class ProblemFive {
	public static void main(String[] args) {
		int i, output = 1;
		int arr[] = new int[] {1,2,3,4,5,6};
		if (arr.length <= 0) {
			System.out.println("output=-2");
		} else {
			for (i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 0) {
					output = output * arr[i];
				}

			}
			System.out.println("product of positive numbers =" + output);
		}
	}
}
