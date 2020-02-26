package cog.cts.twentsix;

import java.util.Scanner;

public class ArrayAsc {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, temp=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Input the number of element to be stored in Array: ");
		int n = input.nextInt();
		int arr[] = new int[n];
		System.out.println("Input Elements in Array");
		for( i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		System.out.println("Element :" +arr[i]);
		}
		
		for( i = 0; i < n; i++) {
		for(int j = i + 1; j<n; j++) {
			if (arr[i] > arr[j]) {
				temp = arr[i];
				arr[i]= arr[j];
				arr[j] = temp;
			
			}
		}
		}
	
			System.out.println("Array in Ascending Order:");
			for(i = 0; i<n; i++) {
				System.out.println(arr[i]);
			
}
		}
		

}


