package com.condtionalstatements;
import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int year=sc.nextInt();
		if(year<=365) {
			System.out.println("not a leap year");
		}else {
			System.out.println("leap year");
		}
		System.out.println("main method is ended");

	}

}
