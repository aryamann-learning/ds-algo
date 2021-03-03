/*Count the multiples of 3 store it into the output variable Input1[]={1,2,3,4,5,6}
 Input2=6
 Output=2
 Input2 is the array size
 BR
 1.Store -1 to the output variable if input array contains any negative elements
 2.Store -2 to the output variable if given input array size is negative 
*/
package com.practice;

import java.util.Scanner;

public class ProblemNine {
	public static void main(String[] args) {
		int i, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("number of elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements");
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		if (arr.length <= 0) {
			System.out.println("output=-2");
		} else if (arr.length > 0) {
			for (i = 0; i < arr.length; i++) {
				if (arr[i] < 0) {
					System.out.println("output=-1");
				} else if (arr[i] % 3 == 0) {
					count++;
				}
			}
			System.out.println("number of multiples of 3=" + count);
		} else {
			System.out.println("no multiples of 3");
		}
		sc.close();
	}
}
