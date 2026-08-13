package Methods;

public class MobileRecharge {
	void show() {
		System.out.println("current plan for recharge");
	    String planname="unlimited299";
	   
	    System.out.println("planname:"+ planname);
	    int validity=28;
	    System.out.println("plan validity:"+validity);
	    float data=1.5f;
	    System.out.println("data:"+data);
	}
	void display() {
		 int rechargeamount=299;
		if(rechargeamount<=300) {
			System.out.println("recharge successfully");
			
		}else {
			System.out.println("recharge unsuccessfully");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("main method is started");
		MobileRecharge m1=new MobileRecharge();
		m1.show();
		m1.display();
		
		System.out.println("main method is ended");
	}

}
