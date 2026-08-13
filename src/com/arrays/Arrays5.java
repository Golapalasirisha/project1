package com.arrays;

import java.util.Arrays;

// reverse arrays suing two ........
public class Arrays5 {

	public static void main(String[] args) {
		System.out.println("main method is stated");
		int arr[]= {10,25,89,96,108,215};
		int temp=0;
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;//
			right--;//
			
		}
	
		
		System.out.println(Arrays.toString(arr));

		}//
}
