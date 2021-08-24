/*Calculate the sum of squares of prime numbers up to N natural number. Consider input1 is the N 
 value. (Consider 1 is not a prime.)*/
package com.practice;

import java.util.Scanner;

public class ProblemThirty {
	public static void main(String[] args) {
		int n,sum=0,num=3;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		
		if(n>0){
			for(int i=2;i<=n;i++){
				if(num/i==1||num/i==i){
					sum+=n*n;
					num++;
				}
				else{
					continue;
				}
			}
		}
		System.out.println("output ="+sum);
		sc.close();
	}

}
