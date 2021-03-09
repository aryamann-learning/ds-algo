/*Write a program to search an element in an array and if it is found store the location into
 Output variable
 Br:
 1) if it is not found store 1 into the output variable
 2) if any element in an input array is negative store -1 into output variable
 3) if the size of an array is negative store -2 into the output variable*/

package com.practice;

import java.util.Scanner;

public class ProblemSeven {
	public static void main(String[] args) {
		int n, x, flag = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		int i;
		for (i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("Enter the element you want to find:");
		x = s.nextInt();
		for (i = 0; i < n; i++) {
			if (a[i] == x) {
				flag = 1;
				break;
			} else {

				flag = 0;
			}
		}
		if (flag == 1) {
			System.out.println("Element found at position:" + (i + 1));
		} else {
			System.out.println("Element not found output=1");
		}

		s.close();
	}

}
