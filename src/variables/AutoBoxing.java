package variables;

public class AutoBoxing {
     int a=10;
     Integer i=a;
     char c='F';
     int b=c;
	public static void main(String[] args) {
		AutoBoxing a1=new AutoBoxing();
		a1.i=15;
		System.out.println(a1.i);
		System.out.println(a1.b);
		

	}

}
