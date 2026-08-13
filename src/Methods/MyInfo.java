package Methods;

public class MyInfo {

	 void main(String[] args) {
		System.out.println("main method is started");
		Student("sirisha","golapala");
		collegedetails();
		Studenthobbies("sports","singing");
		faculty("Firoz","SPM","subbu","m1");
		
		
		System.out.println("main method is ended");

	}
	void Student(String fname,String lname) {
		System.out.println(" the student name is:"+fname+" "+lname);
		int studentid=12;
		String studentcourse="Ai&ds";
		int yoi=2022;
		int yop=2026;
		System.out.println("student id:"+studentid);
		System.out.println("student course:"+studentcourse);
		System.out.println("student id:"+yoi);
		System.out.println("student id:"+yop);
		
		}
	void collegedetails() {
		String collegename="chalapathy";
		int collegeid=134;
		String coursesavailbility="CSE,ECE,MTECH,ML,AI&DS,AI";
		
		double fee=150000;
		System.out.println("college name:"+collegename);
		System.out.println("college id:"+collegeid);
		System.out.println("fee sturcture of college:"+fee);
		System.out.println("Availabilty courses in college:"+coursesavailbility);
	}
	void Studenthobbies(String name,String s) {
		System.out.println("intrested in "+name+" , "+"intrested in "+s);
	
	}
	void faculty(String name,String subject,String s,String s1) {
		System.out.println("name of the faculty:"+name);
		System.out.println("he teaching:"+subject);
		System.out.println("name of the faculty:"+s);
		System.out.println("he teaches:"+s1);
		
	}
	
	
}
