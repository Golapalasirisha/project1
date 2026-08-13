package Constructors;

public class Employee {
	int empid;
	String empname;
	 double empsaal;
	
	Employee(){
		System.out.println("no arg constructor");
	}
	Employee(int empid,String name,double empsaal){
		System.out.println("one parameterized constructors");
		this.empid=empid;
		this.empname=name;
		this.empsaal=empsaal;
	}
//	Employee(Employee e,String empname){
//		this.empid=e.empid;
//		this. empname=e.empname;
//	}
	Employee(Employee e){
		this.empid=e.empid;
		this.empname=e.empname;
		this.empsaal=e.empsaal;
		empsaal=empsaal+10001;
	}
//	
//	Employee(Employee e,Employee e1,double saal){
//		System.out.println("two parameterized constructors");
//		this.empid=e1.empid;
//		this. empname=e1.empname;
//		this.empsaal=e1.empsaal;
//	}

	public static void main(String[] args) {
		System.out.println("main method is started");
		Employee e=new Employee(1,"sirisha",10000);
		e.display();
		System.out.println("************************");
		
		Employee e3=new Employee(e);
		e3.empid=9;
		e3.display();
		
		
		System.out.println("main method is ended");

	}
	void display() {
		System.out.println("EMPLOYEE id:"+empid);
		System.out.println("employee name:"+empname);
		System.out.println("employee salary:"+empsaal);
	}
	

}
