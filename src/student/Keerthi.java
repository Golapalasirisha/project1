package student;

public class Keerthi {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("garabge collection started");
		super.finalize();
	}

	public static void main(String[] args) {
		Keerthi k=new Keerthi();
		System.out.println(k);
		
		Keerthi s=new Keerthi();
		System.out.println(s);
		
		k=null;
		s=null;
		System.gc();
		System.out.println(k);
		System.out.println(s);
		
		Keerthi l=new Keerthi();
		System.out.println(l);

	}

}
