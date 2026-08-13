package com.looping;

import java.util.Scanner;

public class Lsdemo4 {

	public static void main(String[] args) {
		System.out.println("main methosd is started");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
		int n=sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			 fact= fact*i;
		
			
		}
		 System.out.println("the factorial number is"+fact);
		System.out.println("main method is ended");
	}

}
