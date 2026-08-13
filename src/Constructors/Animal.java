package Constructors;
import java.util.Scanner;

public class Animal {
	String animalname;
	String colour;
	Animal(String animalname,String colour){
		System.out.println("print the animal details");
		this.animalname=animalname;
		this.colour=colour;
		
	}
	Animal(){
		System.out.println("no arg constructor");
	}
	
	
	public static void main(String[] args) {
		System.out.println("main meyhod is started");
		Animal a=new Animal();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name of the animal:");
		sc.nextLine();
		System.out.println("enter colour of the animal:");
		sc.nextLine();
		
		
		
		System.out.println("main method is ended");
		
	}
	class Dog extends Animal{
		String breed;
		int age;
		Dog(String animalname,String colour,String breed,int age){
			
			this. breed=breed;
		     this.age=age;
		}
		
			
		}
	}


