package com.looping;

import java.util.Scanner;

public class Lsdemo9 {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i=i+2) {
			
			System.out.println(i);
		}
		System.out.println("main method is ended");

	}

}
