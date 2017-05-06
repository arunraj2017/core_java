/**
 * Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. We'll use the convention of considering only the part of the array that begins at the given index
 * */
package me.learning;

public class Recursion12 {

	public static void main(String[] args) {
		
		int[] nums = { 20, 2, 20 };
		System.out.println(array220(nums, 0));

	}

	private static boolean array220(int[] nums, int index) {

		if (nums.length < 2 || nums[index] == 0) {
			return false;
		} else if (index == nums.length - 1) {
			return false;
		} else {
			double a = nums[index + 1];
			double b = nums[index];
			double k = a / b;
			if (k == 10) {
				return true;
			}
		}
		/*
		 * else if(index>0){ if(nums[index-1]/nums[index]==10){ return true; } }
		 */

		return array220(nums, index + 1);

	}

}
