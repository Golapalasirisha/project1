package variables;

public class Employee {
	int employeeid; 
	char employeegrade;
    boolean employeestatus;
    int employeesalary;
    short employeeexperience;
    float workingdays;
    long phn;
    float bonusamount;

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.employeeid=1;
		e1.employeegrade='A';
		e1.employeestatus=true;
		e1.employeesalary=678900;
		e1.employeeexperience=5;
		e1.workingdays=3456 ;
		e1.phn=9014915387l;
		e1.bonusamount=34.5f;
		
		System.out.println(e1.employeeid);
		System.out.println(e1.employeegrade);
		System.out.println(e1.employeestatus);
		System.out.println(e1.employeesalary);
		System.out.println(e1.employeeexperience);
		System.out.println(e1.workingdays);
		System.out.println(e1.phn);
		System.out.println(e1.bonusamount);
		
		

	}

}
