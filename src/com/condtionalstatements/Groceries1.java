package com.condtionalstatements;

import java.util.Scanner;

public class Groceries1 {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		int option;
		char choice;
		double grandtotal=0;
		do {
			System.out.println("items avaliable");
			System.out.println("vegetables");
			System.out.println("fruits");
			System.out.println("snackks");
			System.out.println("rice bags");
			System.out.println("starionary items");
			option=sc.nextInt();
			String vegetable=sc.next();
			switch(option) {
			
			case 1: {
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
			}
			
			
			
				System.out.println("\nDo you want to buy another vegetable? (y/n)");
	            choice = sc.next().charAt(0);
				}while(choice == 'y'||choice == 'Y');
				System.out.println("grand total"+grandtotal);
				System.out.println("thank you!! visit again");
				System.out.println("********************");
			
		
			
			case 2 :{
				
			
				do {
                  System.out.println("enter the fruite name");
					String fruits=sc.next();
					
					switch(fruits) {
					case "app"-> {
						int price=60;
						System.out.println("cost of apple for kg is 60");
						int quantity;
						System.out.println("enter the quantity");
						quantity=sc.nextInt();
						double appleprice=price*quantity;
						System.out.println("total apple price:"+appleprice);
						grandtotal=grandtotal+appleprice;
						}
					case "orn"->{
						int price=80;
						System.out.println("orange cost per kg 80");
						int quantity;
						System.out.println("enter the quantity");
						quantity=sc.nextInt();
						double ornprice=price*quantity;
						System.out.println("total price of oranges"+ornprice);
						grandtotal=grandtotal+ornprice;
						}
					case "pineapple"->{
						int price=100;
						System.out.println("cost of pineapple is 100");
						int quantity;
						System.out.println("enter the quantity");
						quantity=sc.nextInt();
						double pineappleprice=price*quantity;
						System.out.println("total price of pine apple:"+pineappleprice);
						grandtotal=grandtotal+pineappleprice;
						}
					
					case "grapes"->{
						int price=120;
						System.out.println("kg grapes is 120");
						System.out.println("enter the quantity");
						int quantity=sc.nextInt();
						double grapesprice=price*quantity;
						System.out.println("total grapes price:"+grapesprice);
						grandtotal=grandtotal+grapesprice;
						}
					case "avacodo"->{
						int price=200;
						System.out.println("avacado cose is 200");
						System.out.println("enter the quantity");
						int quantity=sc.nextInt();
						double avacadoprice=price*quantity;
						System.out.println("total avacado price:"+avacadoprice);
						grandtotal=grandtotal+avacadoprice;
						}
					default->System.out.println("sorry those fruits are not available");
					}
				
					System.out.println("do you want to buy more:");
					choice=sc.next().charAt(0);
				
			}while(choice == 'y'|| choice == 'Y');
			}
	
			case 3->{
//				do {
//					
//				}while();
//			
//			}
		}
		
		
		
		
		System.out.println("main method is ended");

	}


