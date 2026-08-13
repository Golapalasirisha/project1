package com.condtionalstatements;
import java.util.Scanner;

public class LogicalStatements {
	
	
	 void main(String[] args) {
	System.out.println("main method is started");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the age:");
	int age=sc.nextInt();
	if(age>18) {
		System.out.println("you are eligible for vote:");
	}
	else {
		System.out.println("you are not elgible for vote");
		System.out.println("go and play games");
	}
	System.out.println("main method is ended");

	}

}
