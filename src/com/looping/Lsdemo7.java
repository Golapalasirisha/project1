package com.looping;

import java.util.Scanner;

public class Lsdemo7 {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			if((i%2==0)) {
				System.out.println(i);
			}

		}
		

	}

}
