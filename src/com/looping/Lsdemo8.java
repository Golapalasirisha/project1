package com.looping;

import java.util.Scanner;

public class Lsdemo8 {

	public static void main(String[] args) {
		System.out.println("main method is started ");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		int fact1=1;
		for(int i=1;i<=n;i++) {
			fact1=fact1*i;
			int fact=(i* i * i);
			System.out.println(fact);
			System.out.println("***********************");
			System.out.println(fact1);
		}

	}

}
