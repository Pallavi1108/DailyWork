package cog.cts.twentsix;

import java.util.Scanner;

public class EvenOddArray {

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
		System.out.println("Even Array:");
		for(int i = 0; i<n; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}		
		}
		System.out.println("ODD Array:");
			for(int j = 0; j<n; j++) {
				if(arr[j]%2!=0) {
					System.out.println(arr[j]);
				}
		}
			
		}
		}
	
	

