package Methods;
import java.util.Scanner;

public class Caluculator {
	

	

	int add(int a,int b) {
		int sum=a+b;
		System.out.println("add:"+sum);

		return sum;
		
	}
	int mul(int a,int b) {
		int mul=a*b;
		System.out.println("mul:"+mul);
		return mul;
	}
	int div(int a,int b) {
		int div=a/b;
		System.out.println("div:"+div);
		return div;
	}
	int mod(int a,int b) {
		int mod=a%b;
		System.out.println("mod:"+mod);
		return mod;
	}

	public static void main(String[] args) {
	System.out.println("main method is started");
	Scanner sc=new Scanner(System.in);
	Caluculator c=new Caluculator();
	System.out.println("enter the value a:");
	System.out.println("enetr the value b:");
	
	int a=sc.nextInt();
	int b=sc.nextInt();

	c.add(a, b);

	c.mul(a, b);
	c.div(a, b);
	c.mod(a, b);
	System.out.println("main method is ended"); 

	}

}
