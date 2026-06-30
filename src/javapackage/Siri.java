package javapackage;

public class Siri {
	//declaration of Static and instance variables....
	//Insatance variables
	int id;
	String name;
	//static variables
	static int orgid;
	static String orgname;
	

	public static void main(String[] args){ 
	System.out.println("Accessing the static variables ");
	System.out.println(orgid);
	System.out.println(orgname);
	//creating an Object................................
	Siri s1= new Siri();
	s1.id=54;
	s1.name="Ashok";
	System.out.println("................Creatin an Object...................");
	System.out.println(s1.id);
	System.out.println(s1.name);
	//we can access the static variables through an object...............
	System.out.println("........accessing the static variables by an Object............");
	System.out.println(s1.orgid);
	System.out.println(s1.orgname);
//	//we can access the static variables by class also..................
	System.out.println("accessin the static variables by a class.....................");
	System.out.println(Siri.orgid);
	System.out.println(Siri.orgname);	

	
		

	}

}
