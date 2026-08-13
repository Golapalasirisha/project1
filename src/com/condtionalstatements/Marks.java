package com.condtionalstatements;
import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
     
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
		int marks=sc.nextInt();
		if(marks>90) {
			System.out.println("first class");
		}else if(marks>80) {
			System.out.println("second class");
			
		}
		else if(marks>70) {
			System.out.println("third class");
			
		}
		else if(marks>35) {
			System.out.println("just pass");
			
		}else {
			System.out.println("failed");
			System.out.println("better luck for next time");
		}
		
		System.out.println("main method is ended");

	}

}
