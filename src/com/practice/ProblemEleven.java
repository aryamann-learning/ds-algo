/*Find the sum of prime nos in an array and store it into output variables
 Note :1 is not a prime no
 Input1[]={1,2,3,4,5}
 Input2=5
 Output1=10
 BR
 1.If the given input array contain any negative no store -1 to the output1
 2.if the given input array size is negative store -2 to the output1//
 3.If the input array does not contain any prime nos store -3 to the output1*/

package com.practice;

import java.util.Scanner;

public class ProblemEleven {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		if (arr.length <= 0) {
			System.out.println("output1=-2");
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < 0) {
					System.out.println("output1=-1");
				} else if (arr[i] > 0) {

					for (int j = 2; j <=arr[i]; j++) {
						if (arr[i] % j != 0) {
							break;
						} else {
							sum = sum + arr[i];
						}
						System.out.println("sum of prime numbers=" + sum);

					}

				}

			}
			
		}
		sc.close();
	}

}
