package com.logesh.fibonacci;

public class Fibonnaci {
	public static void main(String[] args) {

		int a = 0, b = 1, fact, n = 14;

		System.out.print(0 + " " + 1);
		for (int i = 0; i < n; i++) {
			fact = a + b;
			System.out.print(" " + fact);
			a = b;
			b = fact;
		}
	}
}