package com.looping;

import java.util.Scanner;

public class Lsdemp11 {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		String c=sc.next();
		for(char c1='A';c1<='a';c1++) {
			System.out.print("  "+c1);
		}
	}

}
