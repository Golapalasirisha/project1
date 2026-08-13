package Constructors;

public class Student1 {
	int stid;
	String name;
	 Student1 (int stid,String name){
		 System.out.println("parameterized construtors");
		 this.stid=stid;
		 this.name=name;
	 }
	 Student1(Student1 s){
		 System.out.println("parameterized construtors");
		 this.stid=s.stid;
		 this.name=s.name;
		 stid=stid+1;
	 }

	public static void main(String[] args) {
		System.out.println("main methos is started");
		 Student1 s=new  Student1 (1,"lakshmi");
		 s.details();
		 System.out.println("*************************");
		 Student1 s1=new Student1(s);
		 s1.name="harini";
		 s1.details();
		
		System.out.println("main methos is ended");

	}
	void details() {
		System.out.println("enter student id:"+stid);
		System.out.println("enter student name:"+name);
	}

}
