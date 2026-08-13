package com.arrays;

public class Arrays {

	public static void main(String[] args) {
		System.out.println("main method is started");
		int arr[];
		arr=new int[5];
		arr[0]=12;
		arr[1]=15;
		arr[2]=16;
		arr[3]=18;
		arr[4]=22;
//		arr[5]=50;
//		arr[6]=60;
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//			
//		}
		for(int n: arr) {
			System.out.println(n);
		}
		System.out.println("main methos is ended------------------------------------------------");

	}

}
