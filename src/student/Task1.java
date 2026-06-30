package student;

public class Task1 {
	
	static int collegeid;
	static String collegename;
	
	static int count=0;
	int studentid;
	String studentname;
	{
	count=count+1;
	}


		
	 public static void main(String[] args) {
		System.out.println("main method started");
		collegeid=12344;
		collegename="St.Mary's";
		
		System.out.println(collegeid);
		System.out.println(collegename);
		
		Task1 t1=new Task1();
		t1.studentid=109;
		t1.studentname="siri";
		
		System.out.println(t1.studentid);
		System.out.println(t1.studentname);
		
		Task1 t2=new Task1();
		t2.studentid=908;
		t2.studentname="keerthi";
		System.out.println(t2.studentid);
		System.out.println(t2.studentname);
		
		Task1 t3=new Task1();
		t3.studentid=1908;
		t3.studentname="sruthi";
		System.out.println(t3.studentid);
		System.out.println(t3.studentname);
		
		
		Task1 t4=new Task1();
		t4.studentid=9108;
		t4.studentname="Hari";
		System.out.println(t4.studentid);
		System.out.println(t4.studentname);
		
		System.out.println("count the number objects is started:"+count);
		
		

	}
 }


