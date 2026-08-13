package com.looping;

import java.util.Scanner;

public class Lsdemo15 {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=sumofdigits(n);
		System.out.println("sum of digits:"+sum);
		System.out.println("main method is ended");
	}
	static int sumofdigits(int n) {
		int sum=0;
		int r=0;
		while(n>0) {
			r=n%10;
//			--------------------------------------
			n=n/10;
			sum=sum+r;
			
			
		}
		return sum;
	}

}
