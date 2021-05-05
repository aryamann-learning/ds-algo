/*Convert celcius to farenheit 
 Business rule: if the input temperature is negative then store -1 to output1*/
package com.practice;

import java.util.Scanner;

public class ProblemThirtyTwo {
	public static void main(String[] args) {
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temperature in celcius");
		c = sc.nextInt();
		if (c < 0) {
			System.out.println("output=-1");
		} else if (c > 0) {
			int Fahrenheit = ((c * 9) / 5) + 32;
			System.out.println("temperature in fahrenheit=" + Fahrenheit);
		}
		sc.close();
	}
}
