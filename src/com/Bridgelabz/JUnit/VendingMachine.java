package com.Bridgelabz.JUnit;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
	
	  /*
    1. Find the Fewest Notes to be returned for Vending Machine
        a. Desc -> There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be
        returned by Vending Machine. Write a Program to calculate the minimum number
        of Notes as well as the Notes to be returned by the Vending Machine as a
        Change
        b. I/P -> read the Change in Rs to be returned by the Vending Machine
        c. Logic -> Use Recursion and check for largest value of the Note to return change
        to get to the minimum number of Notes.
        d. O/P -> Two Outputs - one the number of minimum Note needed to give the
        change and second list of Rs Notes that would given in the Change
     */
		public static void main(String[] args) {

			ArrayList<Integer> noteList = new ArrayList<Integer>();

			int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };

			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the change in Rs to be returned : ");
			int changeAmount = scan.nextInt();

			for (int i = 0; i < notes.length; i++) {
				while (changeAmount >= notes[i]) {
					noteList.add(notes[i]);
					changeAmount = changeAmount - notes[i];

				}

			}

			System.out.println("Minimum notes needed to give the change : " + noteList.size());
			System.out.println(noteList);

		}

}
