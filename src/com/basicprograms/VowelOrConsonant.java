package com.basicprograms;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the alphabet letter ");
		char ch = sc.next().charAt(0);
		sc.close();
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 's':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'S':
			System.out.println("given letter is vowel");
			break;
		default:
			System.out.println("given letter is consonant");

		}

	}
}
