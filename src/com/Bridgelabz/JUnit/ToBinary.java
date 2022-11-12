package com.Bridgelabz.JUnit;

import java.util.Scanner;

public class ToBinary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter decimal number : ");
		int n = scanner.nextInt();
		toBinary(n);

	}

	static void toBinary(int numDecimal) {
		int numBinary[] = new int[100];
		int count = 0;
		while (numDecimal > 0) {
			int rem = numDecimal % 2;
			numDecimal = numDecimal / 2;

			numBinary[count] = rem;
			count++;
		}

		int number = 0;
		for (int i = count - 1; i >= 0; i--) {
			number = number * 10 + numBinary[i];
		}
		System.out.println("binary : " + number);

		int r = number % 10000;
		int l = number / 10000;
		int binary1 = r * 10000 + l;
		System.out.println("after Swapping : " + binary1);

		int decimal = 0;
		int n = 0;
		while (true) {
			if (binary1 == 0) {
				break;
			} else {
				int temp = binary1 % 10;
				decimal += temp * Math.pow(2, n);
				binary1 = binary1 / 10;
				n++;
			}
		}
		System.out.println("decimal after swapping : " + decimal);
	}

}
