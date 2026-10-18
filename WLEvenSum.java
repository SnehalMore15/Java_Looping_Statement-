package com.tka;

public class WLEvenSum {
	public static void main(String[] args) {
		int i = 2, sum = 0;
		while (i <= 20) {
			sum = sum + i;
			i += 2;
		}
		System.out.println(sum);
	}
}
