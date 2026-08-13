package Methods;
import java.util.Scanner;
 class Arthematic {
	Scanner sc=new Scanner(System.in);
	int add(int a,int b) {
		
		int i=a+b;
		return i;
		}
	int sub(int a1,int b1) {
		int s=a1-b1;
		return s;
		
	}
	double div(double a2,double b2) {
		double j=a2/b2;
		return j;
	}
	int mul(double a3,double b3) {
		int k= (int) ((int)a3*b3);
		return k;
		
	}
	int remind(double a4,double b4) {
		double rem=a4%b4;
		return (int) rem;
		
	}

	 void main(String[] args) {
		System.out.println("main method is started");
		
		System.out.println("enter the values:");
		int a=sc.nextInt();
		System.out.println("enter the value");
		int b=sc.nextInt();
		System.out.println("the value of an addition:"+(a+b));
		add(a,b);
		System.out.println("*********************************************");
		System.out.println("enter the values:");
		int a1=sc.nextInt();
		System.out.println("enter the values:");
		int b1=sc.nextInt();
		
		System.out.println("subtract the values:"+(a1-b1));
		int i=a1-b1;
		sub(a1,b1);
		System.out.println("************************************");
		System.out.println("enter the values:");
		double a2=sc.nextDouble();	
		System.out.println("enter the values:");
		double b2=sc.nextDouble();
		System.out.println("the division values:"+a2/b2);
		div(a2,b2);
		System.out.println("************************************");
		System.out.println("enter the values:");
		double a3=sc.nextDouble();	
		System.out.println("enter the values:");
		double b3=sc.nextDouble();
		System.out.println("the multiple values:"+a3*b3);
		div(a3,b3);
		System.out.println("************************************");
		System.out.println("enter the values:");
		double a4=sc.nextDouble();	
		System.out.println("enter the values:");
		double b4=sc.nextDouble();
		System.out.println("the multiple values:"+a3%b3);
	     remind(a4,b4);
		
	
		
		
		
		System.out.println("main method is ended");

	}

}
