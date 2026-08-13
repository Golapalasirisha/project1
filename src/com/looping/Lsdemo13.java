package com.looping;

import java.util.Scanner;

public class Lsdemo13 {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		boolean status=true;
		status(n);
		System.out.println("main method is ended");

	

		
	}
	
   static   boolean status(int n) {
    	 boolean status=true;
    	 
    	 for(int i=2;i<n;i++) {
    		
    		 if(n%i==0) {
    			 status=false;
    			 System.out.println("not a prime number");
    		 }
    		 System.out.println("prime number");
    	 }
    	 
    	 
    	 return status;
	
}
}
