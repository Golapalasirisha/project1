package com.looping;

import java.util.Scanner;

public class Lsdemo12 {

	public static void main(String[] args) {
	System.out.println("main method is started");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	fibonacci(n);
	System.out.println("main method is ended");
	}
	static void fibonacci(int n) {
		int n1=0;
		int n2=1;
		
		for(int i=0;i<n;i++) {
			
		
			System.out.print("  "+n1);
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
}
	
	
	
