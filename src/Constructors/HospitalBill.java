package Constructors;
import java.util.Scanner;

public class HospitalBill {
	
	String patientname;
	int age;
	double roomchargeperday;
	int numberofdaysadmitted;
	
	HospitalBill(String patientname,int age,double roomchargeperday,int numberofdaysadmitted){
		this.patientname=patientname;
		this.age=age;
		this.roomchargeperday=roomchargeperday;
		this.numberofdaysadmitted=numberofdaysadmitted;
		double totalhospitalbill=roomchargeperday*numberofdaysadmitted;
		
	}
	HospitalBill(){
		
	}
//	Total Hospital Bill = Room Charge Per Day × Number of Days Admitted
	
 
	public static void main(String[] args) {
	System.out.println("main method is started");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter patient name:");
	String patientname=sc.nextLine();
	System.out.println("enter age:");
	int age=sc.nextInt();
	System.out.println("enter room charge per day:");
	double room=sc.nextDouble();
	System.out.println("enter the number of days admitted patient:");
	int admitted=sc.nextInt();
	System.out.println("the total hospital bill:"+room*admitted);
	HospitalBill h=new HospitalBill();
	


	System.out.println("main method is ended");

	}

}
