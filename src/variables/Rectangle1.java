package variables;

public class Rectangle1 {
	
	void caluclator() {
	int length=15;
	int bradth=12;
	int area;
	area = 2*(length+bradth);
	int volume;
	volume= length+bradth;
	int per;
	per= length*bradth;
	System.out.println(area);
	System.out.println(per);
	System.out.println(volume);
	}

	public static void main(String[] args) {
		System.out.println("main method is started");
		Rectangle1 r1=new Rectangle1();
		r1.caluclator();
//		System.out.println(r1.area);
		
		
		
	

	}
}


