package com.looping;
import java.util.Scanner;

public class Lsdemo {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("enter a number");
		 int n=sc.nextInt();
		 int square=n*n;
		 int temp=square;
		 int sum=0;
		 while(temp>0) {
			 int digit=temp%10;
			 sum=sum+digit;
			 temp=temp/10;
		 }
		 if(n==0) {
			 System.out.println("its a neon number");
		 }else {
			 System.out.println("its not a neon number");
		 }
		System.out.println("main method ended");
	}

}
