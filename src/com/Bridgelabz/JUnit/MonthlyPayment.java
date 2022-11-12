package com.Bridgelabz.JUnit;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {

		double p, y, r;

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter loan amount : ");
		p = scanner.nextInt();
		System.out.print("years to pay ");
		y = scanner.nextInt();
		System.out.print("per cent interest : ");
		r = scanner.nextInt();

		double n = 12 * y;
		double r1 = r / (12 * 100);
		double payment = p * r / (1 - (Math.pow((1 + r1), (-n))));

		System.out.println("monthly Payment = " + payment);
	}

}
