/**
 * compute 11's after given index
 * */
package me.learning;


public class Recursion11 {

	public static void main(String[] args) {

		int[] input = { 1, 2, 11 ,11};
		System.out.println(array11(input, 1));
	}

	private static int array11(int[] nums, int index) {
		int count = 0;
		if(nums.length==0 || index == nums.length)
			return 0;
		
			if(nums[index] == 11 ){
				count = count +1;
			}		
		
			return count + array11(nums,index+1);
	}

}
