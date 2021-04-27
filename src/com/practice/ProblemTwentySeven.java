/*Search and remove the element from the given input array and then sort the remaining array 
 elements, store that in to the output array. Consider input1 is array elements, input2 is array size 
 and input3 is the search element.
Eg:
 Input1= {54, 26, 78, 32, 55}
 Input2= 5
 Input3=78
 Ouput1= {26, 32, 54, 55}
Business Rules:
i) If any of the array element (input1) is negative store -1 into the output array.
ii) If the array size (input2) is negative store -2 into the output array.
iii) If the search element (input3) is not present in the array (input1) store -3 into the output array*/
package com.practice;

import java.util.Scanner;

public class ProblemTwentySeven {
	public static void main(String[] args) {
		int n, temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the numbers into array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		if (n <= 0) {
			System.out.println("output=-2");
		} else if (n > 0) {
			System.out.println("number want to search and remove");
			int y = sc.nextInt();
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (arr[i] > arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			for (int i = 0; i < n; i++) {
				if (arr[i] < 0) {
					System.out.println("output=-1");
				} else if (arr[i] > 0) {
					for (i = 0; i < n; i++) {
						if (arr[i] ==y) {
							continue;
						} else {
							System.out.print(arr[i] + ",");
						}
					}
				}
			}
		}
		sc.close();
	}
}
