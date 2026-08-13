package com.condtionalstatements;
import java .util.Scanner;

public class weekDays {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		int val;
		System.out.println("enter the value");
		val=sc.nextInt();
		switch(val){
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("IT'S WENDENS DAY");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("FRI DAY");
			break;
		case 6:
			System.out.println("SATUR DAY");
			break;
		case 7:
			System.out.println("sun day");
			break;
			default :
				System.out.println("IN VALID");
		}
		System.out.println("main method is ended");
	}

}
