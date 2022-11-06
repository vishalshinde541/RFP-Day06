package com.Bridgelabz.Logical_Problems;

import java.util.Scanner;

public class Prime_Number {
	
	public static void main(String[] args) {
		int n;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number \nn :");
	    n = scan.nextInt();
	    
	    if (n == 1 || n == 0) {
			System.out.print("Invalid input !! \nEnter number other than 0 and 1 \nn :");
			 n = scan.nextInt();
		}
	    
	    for (int i = 1; i <= n; i++) {
	    	if (n % i == 0) {
				count++;
			}
		}
	    
	    if (count == 2) {
			System.out.println(n + " is a Prime number");
		}else {
			System.out.println(n + " is not a Prime number");
		}
		
	}

}
