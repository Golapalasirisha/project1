package com.looping;

import java.util.Scanner;

public class Lsdemo10 {

	public static void main(String[] args) {
	System.out.println("main method is started");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++) {
		sum=sum+i;
		System.out.println(i);
//		System.out.println(i);
	}
	System.out.println("total sum of the numbers"+sum);
	System.out.println("main method is ended");

	}

}
