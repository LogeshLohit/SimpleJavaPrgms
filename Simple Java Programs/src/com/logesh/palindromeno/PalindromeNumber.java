package com.logesh.palindromeno;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String original = scanner.next();
		String duplicate="";

		for (int i = original.length() - 1; i >= 0; i--) {
			duplicate = duplicate+original.charAt(i);
		}
		 System.out.println(duplicate);

		if (original.equals(duplicate)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		

		/*int original=scanner.nextInt();
		int duplicate;
		int r,n = 0;
		while(original>0)
		{
			r=original % 10;
			n=original+r;
			n=original/10;
		}
		System.out.println(n);
		*/
		
		
		
		
		
	}
}

