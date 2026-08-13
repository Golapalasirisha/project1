package Methods;
import java.util.Scanner;

public class Salary {
	static void salary(String name,double sal) {
		System.out.println("enter the sal");
		
	}

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		String name;
		name=sc.next();
		System.out.println("enter the employee name:");
		double sal;
		sal=sc.nextDouble();
		salary(name,sal);
		
		
		
		
		System.out.println("main method is ended");

	}

}
