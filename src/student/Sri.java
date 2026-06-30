package student;

public class Sri {
	static  int collegeid;
	static  String collegename;
	int rollno;
	String name;
 
	public static void main(String[] args) {
		collegeid=1234;
		collegename="St.Mary's womens college";
		System.out.println("college id:"+collegeid);
		System.out.println("collegename:"+collegename);
		Sri s=new Sri();
		s.rollno=12345;
		s.name="seetha";
		System.out.println(s.rollno);
		System.out.println(s.name);
		
	}

}
