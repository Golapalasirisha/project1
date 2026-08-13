package com.operators;

public class Test1 {
	

	public static void main(String[] args) {
		System.out.println("main method is sarted");
		int a=10;
		int b=20;
		int sum=(a<b)?a:b;
		int c=35;
		
		int d=123;
		boolean s=(a>d)?true:false;
		System.out.println(s);
		String pass=(a<=35)?"pass":"fail";
		System.out.println("result is:"+pass);
		System.out.println(sum);
		System.out.println("main method is ended");

	}

}
