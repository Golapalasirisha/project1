package Constructors;

public class Sampleconstructor {
     String name;
     int id;
     Sampleconstructor(){
    	 this("unknown");
    	 System.out.println("no arg constructor");
     }
     Sampleconstructor(String name){
    	 this(name,0);
    	 System.out.println("one arg constructor");
     }
     Sampleconstructor(String name,int id){
    	 this.name=name;
    	 this.id=id;
    	 System.out.println("one arg constructor");
     }
     
	public static void main(String[] args) {
		System.out.println("main methos is started");
		Sampleconstructor s=new Sampleconstructor();
		s.show();
		System.out.println("*************************");
		Sampleconstructor s1=new Sampleconstructor("hari");
		s1.show();
		System.out.println("*************************");
		Sampleconstructor s2=new Sampleconstructor("siri",123536);
		s2.show();
		System.out.println("main method is ended");

	}
	void show() {
		System.out.println("name:"+name);
		System.out.println("id:"+id);
	}

}
