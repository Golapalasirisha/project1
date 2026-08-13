package com.condtionalstatements;
import java.util.Scanner;

public class Eligible {

	public static void main(String[] args) {
		System.out.println("main method is started");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age<18) {
			
			System.out.println("your are not teenager");
		}else if(age>=30 &&age<=60) {
			
			System.out.println("your are a uncle");
		}
		else if(age<=18) {
			
			System.out.println("your not eligible for marriage");
		}
		
	else if(age>=20) {
			
			System.out.println("your eligible for marriage");
		}
          
          else {
        	  System.out.println("not intersted");
          }
		System.out.println("main method is ended");

	}

}
