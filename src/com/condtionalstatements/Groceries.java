package com.condtionalstatements;

import java.util.Scanner;

public class Groceries {

	

	public static void main(String[] args) {
	System.out.println("main method is started");
	Scanner sc=new Scanner(System.in);
	char choice;
	char fruitechoice;
	double grandtotal=0;
	do {
		System.out.println("********AVAILABLE ITEMS*********");
		System.out.println("vegetables");
		System.out.println("fruits");
		System.out.println("snacks");
		System.out.println("toys");
		System.out.println("rice bags");
		System.out.println("thank you");
		
		System.out.println("enter the name");
	    String vegetable=sc.next();
		
			
				switch(vegetable) {
				
		case "tmt"->{
			int price=45;
			System.out.println("tomato per kg=45:"+price);
			
		     int quantity=0;
		     System.out.println("enter the quantity");
		     quantity=sc.nextInt();
		     double totalprice=price*quantity;
		System.out.println("total price"+totalprice);
		grandtotal+=totalprice;
		break;
		}
	    case "potato" -> {
	    	int price=30;
	    	System.out.println("Potato per kg = 30");
	    	int quantity;
	    	quantity=sc.nextInt();
	    	System.out.println("enter the quatity");
	    	double total=price*quantity;
	    	System.out.println("total cost;"+total);
	    	grandtotal=grandtotal+total;
	    }
	    case "onion" ->{
	    	int onprice=40;
	    	
	    	System.out.println("Onion per kg = 40");
	    	int quantity;
	    	System.out.println("enter the quantity");
	    	quantity=sc.nextInt();
	    	double price=onprice*quantity;
	    	System.out.println("total price:"+price);
	    	grandtotal=grandtotal+price;
	    }
	    case "carrot" ->{
	    	int carprice=60;
	    	System.out.println("Carrot per kg = 60");
	    	int quantity;
	    	System.out.println("enter the quantity");
	    	quantity=sc.nextInt();
	    	double price=carprice*quantity;
	    	System.out.println("total pric of carrot"+price);
	    }
	    case "beans" -> {
	    	
	    	int beanprice=70;
	    	System.out.println("Beans per kg = 70");
	    	int quantity;
	    	System.out.println("enter the quantity");
	    	quantity=sc.nextInt();
	    	double price=beanprice*quantity;
	    	System.out.println("total pric of carrot"+price);
	    }
	    case "cabbage" ->{
	    	int cabprice=35;
	    	System.out.println("Cabbage per kg = 35");
	    	int quantity;
	    	System.out.println("enter the quantity");
	    	quantity=sc.nextInt();
	    	double price=cabprice*quantity;
	    	System.out.println("total pric of carrot"+price);
	    }
	    case "cauliflower" -> {
	    	int price=50;
	    	System.out.println("Cauliflower per kg = 50");
	    	int quantity;
	    	
	    	System.out.println("enter the quantity");
	    	quantity=sc.nextInt();
	    	double totalprice=price*quantity;
	    	System.out.println("the total price:"+totalprice);
	    	grandtotal=grandtotal+totalprice;
	    
	    }
	    case "brinjal" -> {
	    	int price=40;
	    	System.out.println("Brinjal per kg = 40");
	    	
	    	int quantity;
	    	
	    	System.out.println("enter the quantity");
	    	quantity=sc.nextInt();
	    	double totalprice=price*quantity;
	    	System.out.println("the total price:"+totalprice);
	    	grandtotal=grandtotal+totalprice;
	    }
	    case "chilli" -> {
	    	int price=80;
	    	System.out.println("Green Chilli per kg = 80");
		    int quantity;
	    	
	    	System.out.println("enter the quantity");
	    	quantity=sc.nextInt();
	    	double totalprice=price*quantity;
	    	System.out.println("the total price:"+totalprice);
	    	grandtotal=grandtotal+totalprice;
	    }
		
	    default -> System.out.println("Vegetable not available");
		
	}
		 
//	    do {
//	    	char fruite;
//	    	String fruits=sc.next();
//	    	
//	    	
//	    }while(fruite=='y'&& fruite=='Y');
				System.out.println("\nDo you want to buy another vegetable? (y/n)");
	            choice = sc.next().charAt(0);	
		}while(choice=='y'|| choice=='Y');
			System.out.println("grandtotal:"+grandtotal);
			System.out.println("thanks you");
		System.out.println("visit agiain");
	}
	}
	System.out.println("main method is ended");
	
	

	}
}

