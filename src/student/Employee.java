package student;

public class Employee {
	static String companyname;
	static String companylocation;
	String employeename;
	int employeesalary;
// static block
	static {
		 companyname="Accenture";
		 companylocation="Banglore";
		
		}
	
		//insatnce block
	{

		String employeename="Siri";
		int employeesalary=60000;
	}
		
	public static void main(String[] args) {
		
		
		System.out.println("companyname:"+companyname);
		System.out.println("companylocation:"+companylocation);
		
		Employee e1=new Employee ();
		e1.employeename="seetha";
		e1.employeesalary=130000;
		System.out.println("employeename:"+e1.employeename);
		System.out.println("employeesalary:"+e1.employeesalary);
		Employee e2=new Employee();
		e2.employeename="karthik";
		e2.employeesalary=120000;
		System.out.println("employeename:"+e2.employeename);
		System.out.println("employeesalary:"+e2.employeesalary);
		
		
		
	}
	
				
	

}
