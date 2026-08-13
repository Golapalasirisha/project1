package com.condtionalstatements;
import java.util.Scanner;
public class CollegeAdmission {

	public static void main(String[] args) {
		System.out.println("main method is started");
		String name;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name");
		name=sc.nextLine();
		String mailid;
		System.out.println("enter your mail id");
		mailid=sc.nextLine();
		
		System.out.println("enetr your phn number");
		long num=sc.nextLong();
		
		if(num==123456789) {
			System.out.println("okay!! proceed");
			System.out.println("enter your intermediate details");
			System.out.println("enter your college name");
			boolean college=sc.nextBoolean();
			if(college=true) {
				System.out.println("okay");
			}
			System.out.println("enter your intermediate mrks");
			int marks=sc.nextInt();
			if(marks>700) {
				System.out.println("good");
				System.out.println("enter your rank card");
				int rankcard=sc.nextInt();
				if(rankcard<=50000) {
					System.out.println("you are eligible for this college");
				}
					
				else {
					System.out.println("sorry you may work hard");
				}
			}else {
				System.out.println("you must pass the intermediate");
			}
		}
		
		else {
			System.out.println("invalid");
		}
		System.out.println("main method is ended");

	
	}

}
