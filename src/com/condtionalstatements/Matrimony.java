package com.condtionalstatements;
import java.util.Scanner;
public class Matrimony {

	 static double salary;
	public static void main(String[] args) {
		System.out.println("main methos is started");
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the salary");
		salary=sc.nextDouble();
		if(salary>=300000 ) {
			System.out.println("oaky proceed");
			
			
			System.out.println("enter your height");
			 double height=sc.nextDouble();
			if(height >=6.0) {
				System.out.println("that's cool");
				System.out.println("what is your weight");
			double weight=sc.nextDouble();
			if(weight<80) {
				System.out.println("ohhh");
//				System.out.println("what is your net worth");
//				double nw=sc.nextDouble();
//				
//				if(nw) {
//					
//				}
//				
				
			}else {
				System.out.println("sorry");
			}
				
				
			}else {
				System.out.println("sorry your height is not match for my daughter");
			}
		}
		else {
			System.out.println("we will contacy you");
		}
		System.out.println("main method is ended");
	}

}
