package Constructors;

public class Bike {
	String bikemodel;
	int bikenumber;
	String bikecolour;
	Bike(String i,int j,String k){
		bikemodel=i;
		bikenumber=j;
		bikecolour=k;
		
		System.out.println("bike details");
	}
	Bike(){
		
	}

	public static void main(String[] args) {
		System.out.println("main method is started");
		Bike b=new Bike("rj20",234,"black");
		b.show();
		System.out.println("*******************************");
		Bike b2=new Bike();
		b2.show();
		System.out.println("main method is ended");

	}
	 void show() {
		System.out.println("bikemodel:"+bikemodel);
		System.out.println("bike number:"+bikenumber);
		System.out.println("bike colour:"+bikecolour);
	}

}
