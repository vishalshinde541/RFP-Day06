package com.Bridgelabz.Logical_Problems;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {
		int n;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number \nn :");
		n = scan.nextInt();

		isPerfectNumber(n);
	}

	public static boolean isPerfectNumber(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}

		if (sum == n) {
			System.out.println(n + " is perfect number");
			return true;
		} else {
			System.out.println(n + " is not a perfect number");
			return false;
		}

	}

}
