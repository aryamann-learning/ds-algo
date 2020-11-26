package com.myarrays;

public class Palindrome {
	static boolean palindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] ags) {
		String str = " arya";
		if (palindrome(str))
			System.out.print("yes");
		else
			System.out.print("no");
	}
}
