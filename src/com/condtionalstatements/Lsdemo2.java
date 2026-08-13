package com.condtionalstatements;
import java.util.Scanner;
public class Lsdemo2 {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("enter the number how many times the table has been print");
		int n1=sc.nextInt();
		for(int i=1;i<n1;i++) {
			System.out.println(n+" X "+i+" = "+n*i);
		}
		
		
		System.out.println("main method is ended");

	}

}
