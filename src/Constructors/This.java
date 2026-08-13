package Constructors;

public class This {
	int age;
	String name;
	This(){
		this(10,"siri");
	}
     This(int age,String name){
    	 this.age=age;
    	 this.name=name;
		
	}

	public static void main(String[] args) {
		System.out.println("main method is started");
		This t=new This(0,"name");
		
		System.out.println("main method is ended");

	}

}
