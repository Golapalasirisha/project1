package Methods;

public class Bank {
	static int accno=234501;
    static String bankname="baroda";
    int ifcs=12345666;
    String bankholder="sirisha";
    void details(String bankholder,int ifcs) {
    	System.out.println("AccountNumber:"+accno);
    	System.out.println("BankName:"+bankname);
    	System.out.println("BANK IFCS:"+ifcs);
    	System.out.println("Bankholder:"+ bankholder);
    	accno=accno+1;
    }

	public static void main(String[] args) {
		System.out.println("main method is started");
		 Bank b=new  Bank();
		 b.details("siri",34646);
		
		 Bank b1=new  Bank();
		 b1.details("hari",2345);
		Bank b2=new Bank();
		b2.details("hanivika", accno);
		System.out.println("main method is ended");

	}

}
