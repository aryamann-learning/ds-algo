package com.practice;

public class ProblemFour {
	public static void main(String[]args){
		int i,temp=1;
		int arr[]={1,2,3,4,5,6};
		if (arr.length <= 0) {
			System.out.println("output= -2");
		}
		for(i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				temp=temp*arr[i];
			}else{
				continue;
			}
		}
		if(arr.length>0){
		System.out.println("output="+temp);
		}
	}
	}

