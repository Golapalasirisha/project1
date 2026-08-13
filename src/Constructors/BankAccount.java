package Constructors;

public class BankAccount {
	String accountholder;
	int accountnuber;
	Double balance;
	 BankAccount() {
		 this("unknown");
		System.out.println("no arg constructor");
	}

	public BankAccount(String accountholder) {
		this("unknown",0);
//		
//		this.accountholder = accountholder;
//		System.out.println("one arg constructor");
	}

	public BankAccount(String accountholder, int accountnuber) {
		this("unknown",0,0.0);
		
//		this.accountholder = accountholder;
//		this.accountnuber = accountnuber;
		System.out.println("two arg constructor");
		
	}

	public BankAccount(String accountholder, int accountnuber, Double balance) {
		
  
		this.accountholder = accountholder;
		this.accountnuber = accountnuber;
		this.balance = balance;
		System.out.println("three arg constructor");
	}

	public static void main(String[] args) {
		System.out.println("main method is started");
		 BankAccount b=new  BankAccount();
		 BankAccount b1=new  BankAccount("hari");
		 b.display();
		 System.out.println("************************");
		 b1.display();
		 System.out.println("************************");
		 BankAccount b2=new BankAccount("siri",234);
		 b2.display();
		
		System.out.println("main method is ended");

	}
	void display() {
		System.out.println("ACCOUNT HOLDER:"+accountholder);
		System.out.println("account number:"+accountnuber);
		System.out.println("balance:"+balance);
	}

}
