/*Find the average of multiples of five up to N natural number. Consider input1 is the N value.
Eg:
 Input1= 15
 Output1=10
Business Rules:
i) If the input1 is negative store -1 in to the output variable.
ii) If input1 is greater than 500 store -2 in to the output variable.*/

package com.practice;

import java.util.Scanner;

public class ProblemTwentySix {
public static void main(String[] args) {
	int n,sum=0,count=0,Average=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	n=sc.nextInt();
	if(n<=0){
		System.out.println("output=-1");
	}else if(n>500){
		System.out.println("output=-2");
	}else if(n>0 && n<500){
		for(int i=5;i<=n;i++){
			if(i%5==0){
				sum=sum+i;
				count++;
			}
		}
	}
	Average = sum/count;
	System.out.println("average of multiples of 5="+Average);
	sc.close();
}
}
