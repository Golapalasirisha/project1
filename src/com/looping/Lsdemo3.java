package com.looping;

import java.util.Scanner;

public class Lsdemo3 {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("enter the number how many times it will repeat");
		int n1=sc.nextInt();
		for(int i=1;i<=n1;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
		
		System.out.println("main method is ended");
	}

}
