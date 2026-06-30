package student;

public class Bike {
	@Override
	protected void finalize()  {
	System.out.println("finalize method is satrted");
	}

	public static void main(String[] args) {
		System.out.println("main method statred");
		 Bike re=new  Bike();
		 Bike ket=new Bike();
		 Bike le=new Bike();
//		 it creates aunique adress of an object........
		 re=null;
		 ket=null;
		 System.gc();
		 System.out.println(re);
		 System.out.println(ket);
		 System.out.println(le);
		 

	}

}
