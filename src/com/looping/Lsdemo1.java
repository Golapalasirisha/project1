package com.looping;

import java.util.Scanner;

public class Lsdemo1 {

	public static void main(String[] args) {
	System.out.println("main method is started");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a nuber");
	int n=sc.nextInt();
	for(int i=n;i<=10;i++) {
		System.out.println(i);
	}
	System.out.println("main method is ended");
	}

}
