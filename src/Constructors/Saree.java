package Constructors;

public class Saree {
	double sareecost;
	String sareetype;
	String sareecolour;
	int quantity;
	private int saree=0;
	Saree(double sareecost,String sareetype,String sareecolour,int quantity){
		sareecost=sareecost;
		sareetype=sareetype;
		sareecolour=sareecolour;
		quantity=quantity;
		saree=0;
	}
	Saree(double sareecost,String sareetype,String sareecolour){
		this.sareecost=sareecost;
		this.sareetype=sareetype;
		this.sareecolour=sareecolour;
		this.quantity=quantity;
		saree=1;
		saree=saree+1;
		
	}

	public static void main(String[] args) {
		System.out.println("main method is started");
		Saree s=new Saree(5000.00,"kanchipuram","pink",2);
		s.sar();
		System.out.println("************************");
		Saree s1=new Saree(5000.00,"kanchipuram","pink",1);
		s1.sar();
		
		
		System.out.println("main method is ended");

	}
	void sar() {
		System.out.println("saree cost:"+sareecost);
		System.out.println("saree type:"+sareetype);
		System.out.println("saree colour:"+sareecolour);
		System.out.println("saree quantity:"+quantity);
		
	}

}
