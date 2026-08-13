package Constructors;

public class Student {
	int studentid;
	String stname;
	String stcourse;
	Student(){
		this(1,"unknown");
		System.out.println("no arg constructor");
	}
	Student(int studentid,String stname){
		this(1,"siri","btech");
		System.out.println("one arg constructor");
//		this.studentid=studentid;
//		this.stname=stname;
	}
	Student(int studentid,String stname,String stcourse){
		System.out.println("two arg constructor");
		this.studentid=studentid;
		this.stname=stname;
		this.stcourse=stcourse;
		studentid=studentid+1;
	}
public static void main(String[] args) {
	System.out.println("main mehtod is started");
	Student s=new Student();
	s.dis();
	
	System.out.println("main method is endeed");
}
void dis() {
	System.out.println("student id:"+studentid);
	System.out.println("student name:"+stname);
	System.out.println("student course:"+stcourse);
}

}
