package student;

public class Hello {

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("main method is started");
		
		
		//bootstarap classloader is 
		
		
		Class.forName("java.lang.System");
		Class.forName("java.lang.String");
//		System.out.println(10/0);
		Class.forName("com.mysql.cj.Driver");
		
		
		
		System.out.println("main method is ended");
	}

}
