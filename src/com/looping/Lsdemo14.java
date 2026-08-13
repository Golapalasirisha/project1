package com.looping;

import java.util.Scanner;

public class Lsdemo14 {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=50;i++) {
			if(status(i)) {
				System.out.println("is prime");
				
			}else {
				System.out.println("non prime");
			}
		}
		

	}
      static boolean status(int n) {
		boolean status=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				status=false;
				
				break;
			}
			
		}
	 
		return status;
	}
    

}
