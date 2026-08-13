package com.condtionalstatements;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("enter a number:");
		a=sc.nextInt();
		int b;
		System.out.println("enter b number");
		b=sc.nextInt();
		
		System.out.println("enter the Sysmbol ");
		sc.nextLine();
		String symb = sc.nextLine();
		switch(symb){
		case "+":
			System.out.println("addtion the two numbers:"+(a+b));
			break;
			
		case "%":
			System.out.println("print the modulus value"+(a%b));
			break;
		case "/":
			System.out.println("divi values"+(a/b));
			break;
		default :
				System.out.println("you enter an invalid values");
				break;
			}
		
		System.out.println("main method is ended");

	}

}
