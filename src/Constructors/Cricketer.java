package Constructors;
import java.util.Scanner;

public class Cricketer {
	String name;
	int numberofmatches;
	int runs;
	class Crickter{
		
		public Object Crickter;
		public Crickter(String playername, int matches, int runs) {
			// TODO Auto-generated constructor stub
		}
		void player(String name,int numberofmatches, int totalruns) {
		System.out.println("enter the crickter details");
		name=name;
		numberofmatches=numberofmatches;
		runs=totalruns;
		
		

		}
		Crickter(){
			System.out.println("no arg constructor");
		}
		void avgruns(int runs,int matches) {
			double avg=runs/matches;
			System.out.println("avg runs:"+avg);
			
		}
	}
		
		
//	Average Runs = Total Runs / Matches Played

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the player name");
		
		 String playername=sc.nextLine();
		System.out.println("enter the number of matchs");
		
		int matches=sc.nextInt();
		System.out.println("enter the runs");
		int totalruns=sc.nextInt();
		 Crickter c1=new  Crickter();
		 Object crickter = c1.Crickter;
		 crickter(playername,matches,totalruns);
		 
		c1.avgruns(totalruns,matches);
	
		
		
	
	
		
		
		System.out.println("main method is ended");

	}




	private static void crickter(String playername, int matches, int totalruns) {
	// TODO Auto-generated method stub
	
}




	private static void play() {
	// TODO Auto-generated method stub
	
}




	private static void player() {
		// TODO Auto-generated method stub
		
	}

}
