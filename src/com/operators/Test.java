package com.operators;

public class Test {

	public static void main(String[] args) {
	System.out.println("main method is started");
	int a=10;
	int b=5;
	int temp=a;
	a=b;
	b=temp;
	System.out.println(a);
	System.out.println(b);
	System.out.println(++a);
	System.out.println(a++);//6==7
	System.out.println(a);
	System.out.println(b++);
	System.out.println(++b);
	System.out.println(a);
	System.out.println("*******************");
	System.out.println("print add:"+a+b);
	System.out.println("print add:"+(a+b));
	System.out.println("mul:"+a*b);
	System.out.println("div:"+a/b);
	System.out.println(a%b);
	System.out.println(a^b);
	
	
	
	
	System.out.println("main method is ended");

	}

}
