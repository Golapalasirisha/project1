package Methods;

public class BankAccount {

	public static void main(String[] args) {
		System.out.println("main method is started");
		 BankAccount b1=new  BankAccount();
		 b1.display();
		
		System.out.println("main method is ended");
		

	}
	void display() {
		long bankaccount=365913738;
		String bank_accountname="IFCS";
		String bankaccount_type="Business";
		System.out.println( bankaccount);
		System.out.println(bank_accountname);
		System.out.println(bankaccount_type);
	}

}
