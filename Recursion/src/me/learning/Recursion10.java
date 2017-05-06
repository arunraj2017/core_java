/**
 * check 6 is present or not
 * */
package me.learning;

public class Recursion10 {

	public static void main(String[] args) {
		int[] nums = new int[] {};
		System.out.println(array6(nums, 0));
	}

	public static boolean array6(int[] nums, int index) {
		if(nums.length==0)
			return false;
		
		if((index == nums.length-1)){
			if(nums[index] == 6)
				return true;
			else
				return false;
		}
		
		if(nums[index] == 6){
			return true;
		}
		return array6(nums, index+1);
	}
}
