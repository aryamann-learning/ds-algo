/*Convert the given binary number into the decimal number. Consider input1 is the binary number*/
package com.practice;

import java.util.Scanner;

public class ProblemTwentyNine {
	public static void main(String[] args) {
		int n, base = 1;
		int decimal = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the binary number");
		n = sc.nextInt();
		while (n > 0) {
			int last_digit = n % 10;
			n = n / 10;
			decimal += last_digit * base;
			base = base * 2;
		}
		System.out.println("decimal number =" + decimal);
		sc.close();
	}
}
