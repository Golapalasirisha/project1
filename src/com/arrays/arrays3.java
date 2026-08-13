package com.arrays;
// wap to print sum & avg of all the  numbers from an array
public class arrays3 {

	public static void main(String[] args) {
		int[] num= {10,4,5,70,86};
		System.out.println(num);
		int sum=0;
		int avg=0;
//		for(int n:num) {
//			sum=sum+n;
//			avg=sum/num.length;//----------------------------------------------------------------------------------
//		}
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
			avg=sum/num.length;
			System.out.println(num[i]);
			 System.out.println(sum);
			  System.out.println(avg);//
		}
//  System.out.println(sum);
//  System.out.println(avg);
}
}