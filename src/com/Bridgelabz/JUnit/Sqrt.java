package com.Bridgelabz.JUnit;

import java.util.Scanner;

public class Sqrt {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter number to find sqrt");
		int n = scanner.nextInt();
		System.out.println("sqrt = " + sqrt(n));

	}

	static int sqrt(int n) {
		double l = 0.00001;
		// Assuming the sqrt of n as n only
		double x = n;
		// The closed guess will be stored in the root
		double root;
		// To count the number of iterations
		int count = 0;
		while (true) {
			count++;
			// Calculate more closed x
			root = 0.5 * (x + (n / x));
			// Check for closeness
			if (Math.abs(root - x) < l)
				break;
			// Update root
			x = root;
		}
		return (int) root;
	}

}
