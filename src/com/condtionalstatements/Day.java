package com.condtionalstatements;
import java.util.Scanner;
public class Day {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		int week = 0;
		System.out.println("enter the name");
		week=sc.nextInt();
		switch(week) {
		case 1:
			System.out.println("it's monday");
			break;
		case 2:
			System.out.println("it's tues day");
			break;

		case 3:
			System.out.println("it's wednesday");
			break;
			
		case 4:
			System.out.println("thurs day");
			break;
		case 5:
			System.out.println("huhhh! it's friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("finally it's sunday");
			break;
			default:
				System.out.println("in valid");
		}
		System.out.println("main method is ended");

	
	}

}
