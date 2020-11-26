package com.myarrays;

import java.util.Scanner;

public class Factorial {
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int factorial=fact(num);
		sc.close();
		System.out.println("Factorial of the entered number :"+factorial);
	}

	 static int fact(int n)
	   {
	       int output;
	       if(n==1){
	         return 1;
	       }
	       output = fact(n-1)* n;
	       return output;
	   }
	}

