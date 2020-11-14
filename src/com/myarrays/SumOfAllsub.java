package com.myarrays;

public class SumOfAllsub {
	static int sum(int arr[], int n)
	{
		int ans=0;
		for(int i=0; i<n; i++)
			ans += arr[i];
		return (int) (ans*(Math.pow(2,  n-1)));
	}
	public static void main(String[]args)
	{
		int arr[]={6,7,8};
		int n=arr.length;
		System.out.println(sum(arr,n));
	}

}
