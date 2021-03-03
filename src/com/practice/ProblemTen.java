/*Find the product of the digits of the given no and if product is divisible by 3 or 5 store 1 to the
 output variable
 Input1=56
 Output=1
 Input2 is the array size.
 BR
 1.If the given input is negative store -1 to the output
 2.If the given no itself is divided by 3 or 5 store -2 to the output*/
package com.practice;

import java.util.Scanner;

public class ProblemTen {
	public static void main(String[] args) {
		int a, n, product = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		n = sc.nextInt();
		if (n < 0) {
			System.out.println("output=-1");
		} else if (n % 3 == 0 || n % 5 == 0) {
			System.out.println("output=-2");
		} else {
			while (n > 0) {
				a = n % 10;
				n = n / 10;
				product *= a;
			}
			System.out.println("product=" + product);
			if (product % 3 == 0 || product % 5 == 0) {
				System.out.println("output=1");
			}
		}
		sc.close();
	}
}
