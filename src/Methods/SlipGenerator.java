package Methods;
import java.util.Scanner;

public class SlipGenerator {
	

	static void basicsalary(String name,double salary) {
		System.out.println("enter the employee name:");
		double basicsalary=salary;
		double HRA =basicsalary*20/100;
		double DA=basicsalary*10/100;
		double Grossalary=basicsalary+HRA+DA;
		System.out.println("HRA:"+HRA);
		System.out.println("DA:"+DA);
		System.out.println("Grossalary:"+Grossalary);
		
	}

	public static void main(String[] args) {
	System.out.println("main method is started");
	Scanner sc=new Scanner(System.in);
	String name;
	
	System.out.println("enter the employee name");
	name=sc.next();
	
	System.out.println("enter the employee salary");
	double salary=sc.nextDouble();
	basicsalary(name,salary);
//	HRA = Basic Salary × 20 / 100
//			DA = Basic Salary × 10 / 100
//			Gross Salary = Basic Salary + HRA + DA
//	double basicsalary=salary;
//	double HRA =basicsalary*20/100;
//	double DA=basicsalary*10/100;
//	double Grossalary=basicsalary+HRA+DA;
//	System.out.println("HRA:"+HRA);
//	System.out.println("DA:"+DA);
//	System.out.println("Grossalary:"+Grossalary);
	System.out.println("main method is ended");

	}

}
