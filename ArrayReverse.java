package cog.cts.twentsix;

import java.util.Scanner;

public class ArrayReverse {
	
	public static void main(String[] args) {
// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of values to be displayed in Array : ");
		int n = input.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter Element of Array");
	
		
		for(int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
			
		}
		
		
		System.out.println("Print array in reverse order");
		for( int j = n-1; j>=0; j--)
		{
			System.out.println("Array: " +arr[j]);
		}
		
	}
	}
