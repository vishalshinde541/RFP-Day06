package com.Bridgelabz.Logical_Problems;

public class ReverseNumber {
	
	public static void main(String[] args) {
		int num = 1234;
		int revNum = 0;
		
		for (int i = 1234; i > 0; i = i / 10) {
			
			revNum = revNum*10 + (i % 10);
		}
		System.out.println("Original Number : " + num);
		System.out.println("Reverse Number : " + revNum);
	}

}
