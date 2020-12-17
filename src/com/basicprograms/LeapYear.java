package com.basicprograms;

import java.util.Scanner;

public class LeapYear {
	static boolean checkYear(int year) {
		if (year % 400 == 0)
			return true;
		if (year % 100 == 0)
			return false;
		if (year % 4 == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		year = sc.nextInt();
		sc.close();
		System.out.println(checkYear(year) ? "it is leap year" : "not aleap year");
	}

}
