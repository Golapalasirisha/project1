package com.looping;

import java.util.Scanner;

public class lsdemo2 {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int result=findfactors(n);
		System.out.println(result);

	}
	static int findfactors(int n) {
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
//			return fact;
		}
		return fact;
	}

}
