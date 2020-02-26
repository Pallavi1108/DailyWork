package cog.cts.twentsix;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		int sum = 0;
		Scanner input = new Scanner(System.in);
	System.out.println("enter the size of array");
	int number = input.nextInt();
	int a[] = new int[number];
	System.out.println("enter elements in the array");	
	for (int i = 0; i < a.length; i++) {
		a[i] = input.nextInt();		
		sum += a[i];
	}
	System.out.println(sum);

	}
	}


