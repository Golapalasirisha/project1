package com.arrays;
//find the elements for target sum using two pointers
public class Arrays6 {

	public static void main(String[] args) {

		System.out.println("main method is started");
		int[] arr= {10,5,20,32,16,2};
		int target=12;
		int left=0;
		boolean status=true;
		int right=arr.length-1;
		while(left<right) {
			int sum=arr[left]+arr[right];
			if(sum==target) {
				System.out.println(arr[left]+" + "+arr[right]+" = "+sum);
				left++;
				right--;
				status = true;
			}
				else if(sum<target) {
					left++;
			
				}
				else if(sum>target){
					right--;
				}
			else {
				System.out.println("the number is invalid!!");
			}
			
			
			//
		}
		//
	}//
}