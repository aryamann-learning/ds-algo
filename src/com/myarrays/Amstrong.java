package com.myarrays;

public class Amstrong {
	int power(int x, int y) {
		if (y == 0)
			return 1;
		if (y % 2 == 0)
			return power(x, y / 2) * power(x, y / 2);
		return x * power(x, y / 2) * power(x, y / 2);
	}

	int order(int x) {
		int n = 0;
		while (x != 0) {
			n++;
			x = x / 10;
		}
		return n;
	}

	boolean isAmstrong(int x) {
		int n = order(x);
		int temp = x;
		int sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum + power(r,n);
			temp = temp / 10;
		}
		return (sum == x);
	}

	public static void main(String[] args) {
		Amstrong obj = new Amstrong();
		int x = 153;
		System.out.println(obj.isAmstrong(x));
		x = 1436;
		System.out.println(obj.isAmstrong(x));
	}

}
