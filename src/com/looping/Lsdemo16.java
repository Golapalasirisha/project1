package com.looping;

import java.util.Scanner;

public class Lsdemo16 {
	boolean armstrong(int n) {//
	boolean	status=false;
	int temp=0;
	int r=0;
	int sum=0;
	temp=n;
	int digit=String.valueOf(n).length();
	
	
	
	while(n>0) {
		r=n%10;
		
		
				//
		sum=sum+Math.powExact(r, digit);
		System.out.println(sum);
		n=n/10;//
	}
	if(temp==sum) {
		System.out.println("it is a armstrong");
		return true;
	}else {
		System.out.println("it is not a armstrong");
	}
	
	
	
	
	return status;
		
	}

	 void main(String[] args) {
		System.out.println("main method is started");//370
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------`
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();//
		boolean status=armstrong(n);
		System.out.println("main method is ended");

	}

	 

}
