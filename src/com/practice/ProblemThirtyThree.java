/*Given two input arrays input1[],input2[], and size of both arrays is input3
 Add the first element of input1[] to last element of input2[] and 
 Second element of input1[] to last before element of input2[]
 ……………………….
 store result to output1[] 
 Eg.  Input1[]={1.2.3.4}
 Input2[]={4,3,2,1}
 Output1={2,4,6,8}
 Business Rule1: If the size of input array is negative ,then store -2 to output array
 Business Rule2: If any of element in input array is negative then store -1 to output array */
package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemThirtyThree {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		n=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int arr[]=new int[n];
		System.out.println("enter the first array elements");
		for(int i=0;i<n;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter the second array elements");
		for(int i=0;i<n;i++){
			arr2[i]=sc.nextInt();
		}
		if(n<0){
			System.out.println("output=-2");
		}else if(n>0){
			for(int i=0;i<n;i++){
				if(arr1[i]<0 && arr2[i]<0){
					System.out.println("output=-1");
				}else if(n>0){
					for( i=0;i<n;i++){
						 arr[i]=arr1[i]+arr2[n-1-i];
					}
					System.out.println("Output: " + Arrays.toString(arr));
				}
				
			}
		}
		sc.close();
	}

}
