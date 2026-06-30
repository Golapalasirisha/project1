package student;

public class Demo {

	public static void main(String[] args) {
		System.out.println("...main method satrted.......");
		Demo1();
		Demo2();
		System.out.println("method ended");
	}
		static void Demo1(){
			Demo d1=new Demo();
			d1.Demo3();
			System.out.println("..DEMO1...");
			
		}
		static void Demo2() {
			System.out.println("..demo2...");
		}
		void Demo3() {
			Demo4();
			System.out.println(",,,demo3....");
		}
		void Demo4() {

			System.out.println("....demo4......");
		}
	}


