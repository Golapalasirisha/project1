package Constructors;

public class ProductDetails {
	int id;
	String name;
	ProductDetails(){
		System.out.println("constructor called");
	}
	ProductDetails(int id,String name){
		this.id=id;
		this.name=name;
		
	}

	public static void main(String[] args) {
		System.out.println("main method is started");
		
		ProductDetails p1=new ProductDetails();
		
		ProductDetails p2=new ProductDetails(12,"lakshmi");
		p1.show();
		p2.show();
		System.out.println("main method is ended");

	}
	 void show() {
		System.out.println(id);
		System.out.println(name);
	}

}
