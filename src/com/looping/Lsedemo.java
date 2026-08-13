package com.looping;

import java.util.Scanner;

public class Lsedemo {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum=sum+i;
			}
		if(n%2==0) {
//			
			System.out.println("its an even number"+n);
			
			System.out.println(sum);//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		}else {
			System.out.println("not an even number");
		}
		System.out.println("sum"+sum);
		System.out.println("main method is eneded");

	}

}
