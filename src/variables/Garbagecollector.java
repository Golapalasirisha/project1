package variables;

public class Garbagecollector {
	int value;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("garbage collector is called");
		
	}
	
	

	public static void main(String[] args) {
		System.out.println("main method is started");
		 Garbagecollector obj1=new  Garbagecollector();
		 Garbagecollector obj2=new  Garbagecollector();
		 obj1=obj2;
		 obj2=obj1;
		 obj1=null;
		 System.gc();
		 System.out.println();
		 System.out.println("main method started");
		 
		
		

	}

}
