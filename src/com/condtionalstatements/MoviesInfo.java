package com.condtionalstatements;
import java.util.Scanner;
public class MoviesInfo {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the move name");
		String movie=sc.nextLine();
		switch(movie) {
		case "seethamma vakitlo siri malli chettu":
			
			System.out.println("1st hero:mahesh babu");
			System.out.println("2nd hero:venkatesh");
			System.out.println("1st heroine:samntha");
			System.out.println("2nd heroine:anjali");
			System.out.println("father roll:prakash raj");
			System.out.println("mother roll:priya");
			break;
		case "varsham":
			System.out.println("varsham movie details");
			System.out.println("hero:prabhas");
			System.out.println("heroine:trisha");
			System.out.println("mother roll:sharadha");
			System.out.println("father roll:praksh raj");
			System.out.println("movie collections:5000cr");
			break;
			
		case "neney raju neney mantri":
			System.out.println("neney raju neney mantri movie details");
			System.out.println("hero:rana");
			System.out.println("heroine:kajal");
			System.out.println("mother roll:none");
			System.out.println("father roll:arthivi");
			System.out.println("movie collections:5000cr");
			break;
			default:
				System.out.println("invalid");

			
		}
	
		System.out.println("main ethod is ended");

	}

}
