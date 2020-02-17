package com.cog;

import java.util.Scanner;

public class Avgg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sub1, sub2, sub3, sub4, sum = 0, avg = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter marks of subject 1: ");
		sub1 = input.nextInt();
		System.out.println("Enter marks of subject 2: ");
		sub2 = input.nextInt();
		System.out.println("Enter marks of subject 3: ");
		sub3 = input.nextInt();
		System.out.println("Enter marks of subject 4: ");
		sub4 = input.nextInt();
		sum = sub1 + sub2 + sub3 + sub4;
		avg = sum/4;
		
		System.out.println("Average is " + avg);
		// TODO Auto-generated method stub

	}

}
