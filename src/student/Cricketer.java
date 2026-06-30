package student;

public class Cricketer {
	int jerseynumber;
	String Cricketername;
	static int countryid=+91;
	static  String countrynation="INDIA";
    

	public static void main(String[] args) {
		System.out.println("...........method starting........");
		System.out.println(countryid);
		System.out.println(countrynation);
		//creating an object............
		 Cricketer msd=new  Cricketer();
		 System.out.println("......object1 created.......");
		 msd.jerseynumber=7;
		 msd.Cricketername="Mahindra";
		 System.out.println(countryid);
		 System.out.println(countrynation);
		 System.out.println(msd.jerseynumber);
		 System.out.println(msd.Cricketername);
		 
		 
		 Cricketer virat=new  Cricketer();
		 System.out.println("......object2 created.......");
		 virat.jerseynumber=18;
		virat.Cricketername="virat kohili";
		 System.out.println(countryid);
		 System.out.println(countrynation);
		 System.out.println(virat.jerseynumber);
		 System.out.println(virat.Cricketername);

		 Cricketer Sky=new  Cricketer();
		 System.out.println("......object3 created.......");
		 Sky.jerseynumber=87;
		 Sky.Cricketername="Surya kumar Yadav";
		 System.out.println(countryid);
		 System.out.println(countrynation);
		 System.out.println(Sky.jerseynumber);
		 System.out.println(Sky.Cricketername);

		 Cricketer kl=new  Cricketer();
		 countryid=+92;
		 countrynation="BHARAT";
		 System.out.println("......object4 created.......");
		 kl.jerseynumber=27;
		 kl.Cricketername="rahul";
		 System.out.println(countryid);
		 System.out.println(countrynation);
		 System.out.println(kl.jerseynumber);
		 System.out.println(kl.Cricketername);

	}

}
