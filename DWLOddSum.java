package com.tka;

public class DWLOddSum {
	public static void main(String[] args) {
		int i = 1, sum = 0;
		do {
			sum += i;
			i += 2;
		} while (i <= 20);
		System.out.println(sum);
	}
}
