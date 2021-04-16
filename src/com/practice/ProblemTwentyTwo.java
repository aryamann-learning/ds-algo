/*How many 500,100,50,10,1‟s in given input(rupees) value and count that and store it in 
 output variable
Eg:689
500-1
100-1
50-1
10-3
1-9
Output1=15
Business Rule:
Store -1 into output variable if input value is negative*/
package com.practice;

import java.util.Scanner;

public class ProblemTwentyTwo {
	public static void main(String[] args) {
		int n,hundreds,tens,ones;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		if(n<0){
			System.out.println("output = -1");
		}else{
		hundreds = (n/100);
		System.out.println("no of hundreds ="+hundreds);
		tens =(n-(hundreds*100))/10;
		System.out.println("no of tens ="+tens);
		ones = (n-(tens*10)-(hundreds*100));
		System.out.println("no of ones ="+ones);
		sc.close();
	}
	}
}
