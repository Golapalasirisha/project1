package Methods;

import java.util.Scanner;

 class StudentResult {
	void stuentdetails(String name) {
		System.out.println("enter student name:"+name);
		
	}
	void studentmarks(int m1,int m2,int m3,int m4) {
		System.out.println("enter your marks:"+m1);
		System.out.println("enter your marks:"+m2);
		System.out.println("enter your marks:"+m3);
		System.out.println("enter your marks:"+m4);
		
	}
	void totalmarks(int i) {
		System.out.println("total marks:");
	}
	void averge(double k) {
		System.out.println("average marks:");
	}

	 void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		stuentdetails(name);
		
		 System.out.println("enter student marks1");
		 int m1=sc.nextInt();
		 System.out.println("enter student marks2");
		 int m2=sc.nextInt();
		 System.out.println("enter student marks3");
		 int m3=sc.nextInt();
		 System.out.println("enter student marks4");
		 int m4=sc.nextInt();
		 System.out.println("enter student marks5");
		 studentmarks(m1,m2,m3,m4);
		 System.out.println("enter total marks");
		 int i1=sc.nextInt();
		 
		 totalmarks(i1);
		 System.out.println("averagemarks of the student");
		 double i=sc.nextDouble();
		 
		 averge(i);
			
		
		
		
		System.out.println("main method is ended");

	}

}
