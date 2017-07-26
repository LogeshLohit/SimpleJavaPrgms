package com.logesh.primeno;

import java.util.Scanner;

public class PrimeNumberDisplay {

	public static void main(String[] args) {
		int count;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 2; i < n; i++) {
			count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}

			if (count == 0) {
				System.out.print(i+" ");
			}

		}
	}
}
