package Methods;
import java.util.Scanner;

 class TestDemo {
	double caluculateinterest(double principle,double rate,double time) {
		double interest=(principle*rate*time)/100;
		return (int)interest;
		
	}

	 void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principle value:");
		double i=sc.nextDouble();
		System.out.println("enter the rate value:");
		double s=sc.nextDouble();
		System.out.println("enter the time:");
		double d=sc.nextDouble();
		System.out.println("the rate of interest is:"+(i*s*d)/100);
		 caluculateinterest(i,s,d);
		
		
		
		System.out.println("main method is ended");

	}

}
