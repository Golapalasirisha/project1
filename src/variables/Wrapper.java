package variables;

public class Wrapper {
	 Integer  productid;
	static String productname;
	
	 static Integer productprice;
	 static Float productrating;
	 static Boolean productavailabiltystatus;
	 static String stockquality;
	 static Double discountpercentage;
	 static int productcode;
	

	public static void main(String[] args) {
		
		Wrapper w1=new Wrapper();
		w1.productid=101;
		productname="hanish";
		productprice=903;
		productrating=4.5f;
		productavailabiltystatus=true;
		stockquality="good";
		discountpercentage=4.5;
		productcode=4323;
	
		System.out.println(w1.productid);
		System.out.println(productname);
		System.out.println(productprice);
		System.out.println(productrating);
		System.out.println( productavailabiltystatus);
		System.out.println(stockquality);
		System.out.println(discountpercentage);
		System.out.println(productcode);
		
		

	}

}
