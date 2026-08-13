package com.arrays;

public class Arrays1 {

	public static void main(String[] args) {
	int[] arr=new int[10];
	arr[6]=200;
	System.out.println(arr);//its show adress of an object
//	for(int a:arr) {
//		System.out.println(a);
//	}

	for(int i=0;i<arr.length;i++) {
		System.out.println(arr);
	}
	}

}
