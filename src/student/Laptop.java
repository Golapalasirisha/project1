package student;

public class Laptop {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("final method call");
	}

	public static void main(String[] args) {
		Laptop dell=new Laptop();
		System.out.println(dell);
		
		Laptop ln=new Laptop();
		System.out.println(ln);
//		calling the garbage collector
		
		System.gc();
	
		
		dell=null;
		ln=null;
		System.out.println(dell);
		System.out.println(ln);
		
		Laptop ac=new Laptop();
		System.out.println(ac);
	}

}
