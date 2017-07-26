package com.logesh.reverseArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		int[] a = { 1, 4, 3, 2 };

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}

}
