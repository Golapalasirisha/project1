package Methods;

public class Sub {

	public static void main(String[] args) {
		
		System.out.println("main method is started");
		
		Sub s1=new Sub();
	
		s1.add();
		s1.subt();
		s1.div();
		
		
		
		System.out.println("main method is ended");

	}
	
	int add() {
		int a=10;
		int b=20;
		int sum =a+b;
		System.out.println(sum);
		return sum;
	}
	int subt() {
		int a=20;
		int b=5; 
		int subt=a-b;
		System.out.println(subt);
		return subt;
	}
	
	int div() {
		int a=100;
		int b=4;
		int div=a/b;
		System.out.println(div);
		return div;
		
	}

}
