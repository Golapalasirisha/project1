package Constructors;



public class Vehicle {

	int price=150000;
	String model="fzs";
	String colour="black";
	int emi=5000;
	 Vehicle(){
		 System.out.println("parent calss");
		
	 }
	
	 
	public static void main() {
		System.out.println("main methos is started");
		 Vehicle v=new  Vehicle();
		 System.out.println("price of the vehicle"+ v.price);
		 System.out.println("model of the vehicle:"+v. model);
		 System.out.println("emi of the vehicle"+ v.emi);
		 System.out.println("****************************");
		 Car c=new Car();
		c.car();
		System.out.println("main method is ended");
	}
}
	

	 class Car extends Vehicle{
		 
		 void car() {
			 System.out.println("price of the car"+super.price);
			 System.out.println("model of the car:"+ model);
			 System.out.println("emi of the car"+ emi);
		 }
	 }


