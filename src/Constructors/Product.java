package Constructors;

public class Product {
	int productid;
	String productname;
	double price;
	 Product(){
		 System.out.println("no arug constructors called");
		
	}
	 Product(int id,String name,double price){
		 System.out.println("no arug constructors called");
		 productid=id;
		 productname=name;
		 this.price=price;
	 }
		
	 public static void main(String[] args) {
		System.out.println("main method is started");
		Product p1=new Product();
		
		Product p2=new Product(12,"whistle",150);
		p1.show();
		p2.show();
		Product p3=new Product(134,"wheat flour",150);
		p3.show();
		System.out.println("main method is ended");

	}
	 void show() {
		 System.out.println(productid);
			System.out.println(productname);
			System.out.println(price);
		 
	 }

}
