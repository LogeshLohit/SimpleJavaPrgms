package com.logesh.factorial;

public class FactorialOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		System.out.println(fact(n));

	}

	private static int fact(int n) {
		int nn;
		if (n == 0)
			return 1;
		else

			nn = n * fact(n - 1);
		return nn;

	}

}
