package Constructors;

public class Details {
	int empid;
	String empname;
	double empsal;
	Details(int empid,String empname,double empsal){
		System.out.println("parametrized constructor");
		this.empid=empid;
		this.empname=empname;
		this.empsal=empsal;
		
	}
	Details(Details d){
		this.empid=d.empid;
		this.empname=d.empname;
		this.empsal=d.empsal;
		empid=empid+1;
		empsal=empsal+1500;
//	/doctor
//		select*from table emp where job between doc;
	}

	public static void main(String[] args) {
		System.out.println("main method is started");
		Details d=new Details(1,"hari",30000);
		d.details();
		System.out.println("*****************");
		Details d1=new Details(d);
		d1.empname="lakshman";
		d1.details();
		System.out.println("*******************");
		Details d2=new Details(d1);
		d2.empname="siri";
		d2.details();
		
		System.out.println("main method is ended");

	}
	void details() {
		System.out.println("enter the employee id:"+empid);
		System.out.println("enter the employee name:"+empname);
		System.out.println("enter the employee sal:"+empsal);
	}

}
