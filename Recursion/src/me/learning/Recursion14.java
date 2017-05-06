/**
 * Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target?
 * 
 * */

package me.learning;

public class Recursion14 {
	
	public static void main(String[] args) {
		int []nums = {2,4,8};
		int target = 10;
		int start = 0;
		
		boolean result = groupSum(start, nums, target);
		System.out.println(result);
	}

	private static boolean groupSum(int start, int[] nums, int target) {
		if(start==nums.length){
			return target==0;
		}
		
		if(nums.length==0)
			return false;
		
		if(groupSum(start+1, nums, target - nums[start])){
			return true;
		}
		
		if(groupSum(start+1, nums, target)){
			return true;
		}
		
		return false;
	}

}
