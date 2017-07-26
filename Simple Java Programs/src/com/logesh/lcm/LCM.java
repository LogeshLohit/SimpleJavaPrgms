package com.logesh.lcm;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the max size:");
		int n=scanner.nextInt();
		int[] input = new int[n];
		System.out.println("Enter values:");
		for (int i = 0; i < input.length; i++) {
			input[i] = scanner.nextInt();
		}
		System.out.println(lcm(input));

	}

	private static int lcm(int[] input) {
		// TODO Auto-generated method stub
		int result = input[0];
		for (int i = 0; i < input.length; i++)
			result = lcm(result, input[i]);
		return result;
	}

	private static int lcm(int a, int b) {
		return a * (b / gcd(a, b));
	}

	private static int gcd(int a, int b) {
		while (b > 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

}
