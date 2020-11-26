package com.myarrays;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		double num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		System.out.println("enter the operator(+,-,*./)");
		char op = sc.next().charAt(0);
		sc.close();
		double o = 0;
		switch (op) {
		case '+':
			o = num1 + num2;
			break;
		case '-':
			o = num1 - num2;
			break;
		case '*':
			o = num1 * num2;
			break;
		case '/':
			o = num1 / num2;
			break;
		default:
			System.out.println("invalid  input number");
			break;

		}
		System.out.println("final result");
		System.out.println();
		System.out.println(num1 + " " + op + " " + num2 + " " + "=" + o);
	}

}
