package com.tka;

public class DWLFactorial {
	public static void main(String[] args) {
		int i = 1, fact = 1;
		do {
			fact *= i;
			i++;
		} while (i <= 5);
		System.out.println(fact);
	}
}
