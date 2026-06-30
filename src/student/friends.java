package student;

public class friends {
	int id;
	String name;
	String adress;
	int age;


	public static void main(String[] args) {
		friends f1=new friends();
		f1.age=21;
		f1.name="keerthi";
		f1.adress="chavitipalem";
		f1.id=102;
		System.out.println(f1.id);
		System.out.println(f1.name);
		System.out.println(f1.adress);
		System.out.println(f1.age);
		
		friends f2=new friends();
		System.out.println();
		f2.age=21;
		f2.name="siri";
		f2.adress="thubadu";
		f1.id=156;
		System.out.println(f2.id);
		System.out.println(f2.name);
		System.out.println(f2.adress);
		System.out.println(f2.age);

	}

}
