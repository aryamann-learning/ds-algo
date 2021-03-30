/* Fahrenheit to Celsius conversion
1) if the number is negative, store -1 to output*/
package com.practice;

import java.util.Scanner;

public class ProblemFifteen {
	public static void main(String[] args) {
		double celsius, fahrenheit;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter temperature in Fahrenheit:");
		fahrenheit = s.nextDouble();
		if (fahrenheit < 0) {
			System.out.println("output=-1");
		} else {
			celsius = (fahrenheit - 32) * (0.5556);
			System.out.println("Temperature in Celsius:" + celsius);
			s.close();
		}
	}

}
