package student;

public class Task2 {
	static String country;
	static int countryid;
	static int count=0;
	
	int jerseynumber;
	String cricktername;
	{
		count=count+1;
	}

	public static void main(String[] args) {
	
		System.out.println(country);
		System.out.println(countryid);
//		object creation for instance data
		Task2 t1=new Task2();
		t1.jerseynumber=102;
		t1.cricktername ="surya kumar yadav";
		System.out.println(t1.jerseynumber);
		System.out.println(t1.cricktername);
		-----------------------------------------------------------------
		Task2 t2=new Task2();
		t2.jerseynumber=104;
		t2.cricktername ="Rohith sharma";
		
		Task2 t3=new Task2();
		t3.jerseynumber=18;
		t3.cricktername ="virat kohili";
		System.out.println("count is started of an objects:"+count);
		
		
		

	}

}
