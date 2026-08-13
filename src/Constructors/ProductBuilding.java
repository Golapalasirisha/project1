package Constructors;

public class ProductBuilding {
	static String productname;
	
	int price;
	int productquantity;
	ProductBuilding(){
		this("lays");
		System.out.println("no argu constructor");
	}
	ProductBuilding(String productname){
		
		this("honey",500);
		System.out.println("one arg constructor");
		
	}
    ProductBuilding(String productname,int price){
    this("bingo",300,2);
    System.out.println("two arg constructor");
		
	}
    ProductBuilding(String productname,int price,int pq){
    	
    	this.productname=productname;
    	this.price=price;
    	this.productquantity = pq;
    	System.out.println("three arg constructor");

   
    }



	public static void main(String[] args) {
		System.out.println("main method is started");
		 ProductBuilding b=new  ProductBuilding();
		 b.show();
		 System.out.println("***************************");
		 ProductBuilding b1 = new ProductBuilding(productname);
		 b1.show();

		
		
		System.out.println("main method is ended");

	}
 void show() {
	System.out.println("name of the product:"+productname);
	System.out.println("price of the product:"+price);
		System.out.println("quantity of the product"+productquantity);

}
}
