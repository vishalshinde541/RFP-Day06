package com.Bridgelabz.JUnit;

import java.util.Scanner;

public class TemperaturConversion {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of Temprature :\ntemp :");
		int temp = scanner.nextInt();
		System.out.println("select option: \n1.Celsius to Fahrenheit \n2.Fahrenheit to Celsius");
		int option = scanner.nextInt();

		switch (option) {
		case 1:
			int temp1 = (temp * 9 / 5) + 32;
			System.out.println("Temp in fahrenheit is :" + temp1); // Celsius to Fahrenheit
			break;
		case 2:
			int temp2 = (temp - 32) * 5 / 9;
			System.out.println("Temp in Celsius is :" + temp2); // Fahrenheit to Celsius
			break;
		default:
			break;
		}
	}

}
