package cog.cts.twentsix;

import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Input the number of element to be stored in Array: ");
		int n = input.nextInt();
		int arr[] = new int[n];
		System.out.println("Input Elements in Array");
		for(int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		System.out.println("Element :" +arr[i]);
		}
		int maxValue = arr[0];
		for(int i = 0; i<n; i++) {
			if(arr[i] > maxValue) {
				maxValue = arr[i];
			}
		
				
			}
		System.out.println("Max value is:" +maxValue);
	
	int minValue = arr[0];
	for(int i = 0; i>n; i++) {
		if(arr[i] < minValue) {
			minValue = arr[i];
		}
	
			
		}
	System.out.println("Min value is:" +minValue);
	}

}
