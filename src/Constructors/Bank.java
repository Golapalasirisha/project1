package Constructors;

public class Bank {
//	private static final String  = null;
	int bankid;
	float bankifcs;
	String bankaccounttype;
	String name;
	
	Bank(int bankid,float bankifcs,String bankaccounttype,String name){
		System.out.println("bank details");
		this.bankid=bankid;
		this.bankifcs=bankifcs;
		this.bankaccounttype=bankaccounttype;
		this.name=name;
	}
	


	public Bank(float bankaccount, String name) {
		super();
		this.bankaccounttype= bankaccounttype;
		this.name = name;
	}


	public Bank(int bankid, float bankifcs, String bankaccounttype ) {
		super();
		this.bankid = bankid;
		this.bankifcs = bankifcs;
		this.bankaccounttype = bankaccounttype;
	}



	

	public static void main(String[] args) {
		System.out.println("main method is satrted");
		Bank b=new Bank(1,123456667,"local","baroda");
		Bank b1=new Bank(123456678,"anusha");
		Bank b2=new Bank(23445677,423536729,"indian");
		Bank b3=new Bank(123245,64839291,"hyrid","anu");
		b.show();
		b1.show();
		b2.show();
		b3.show();
		System.out.println("main method is ended");

	}

	void show() {
		System.out.println("bank id:"+bankid);
		System.out.println("bank ifcs:"+bankifcs);
		System.out.println("bank bankaccounttype:"+bankaccounttype);
		System.out.println("bank name:"+name);
		
		
	}
}
