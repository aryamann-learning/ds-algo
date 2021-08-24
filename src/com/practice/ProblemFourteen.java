package com.practice;

import java.util.Scanner;


public class ProblemFourteen {
	
			
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		  
		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			}
		if(arr.length<0){
			System.out.println("output=-2");
		}
		else if(arr.length>0){
			for(int i=0;i<arr.length;i++){
			            if (arr[i] != arr[i + 1]) { 
			                temp[j++]= arr[i]; 
			               
			            } 
			        } 
			  
			        temp[j++] = arr[n - 1]; 
			  
			        // Changing the original array 
			      		        
			        
		}
		 return j;
	}
	
public static void main(String[]args){
	i=removeduplucates(n.iemp);
}*/

		public static int removeduplicates(int a[], int n)
	    {    int i;
	        if (n == 0 || n == 1) {
	            return n;
	        }
	 
	        // creating another array for only storing
	        // the unique elements
	        int[] temp = new int[n];
	        int j = 0;
	        if(n<0){
				System.out.println("output=-2");
	        }else if(n>0){
	        	for(i=0;i<n;i++)
	        for (i = 0; i < n - 1; i++) {
	            if (a[i] != a[i + 1]) {
	                temp[j++] = a[i];
	            }
	        }
	 
	        temp[j++] = a[n - 1];
	 
	        // Changing the original array
	        for ( i = 0; i < j; i++) {
	            a[i] = temp[i];
	        }
	 
	        return j;
	    }
	    public static void main(String[] args)
	    {
	        int a[] = { 1, 1, 2, 2, 2 };
	        int n = a.length;
	 
	        n = removeduplicates(a, n);
	 
	        // Printing The array elements
	        for (int i = 0; i < n; i++)
	            System.out.print(a[i] + " ");
	    }
	}
}
