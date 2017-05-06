package me.learning;

public class Recursion8 {
	public static void main(String[] args) {
		int[] nums = {0,0,0,0,0,6};
		System.out.println(array6(nums,0));
	}

	private static boolean array6(int[] nums, int i) {
		
		if(nums.length==0){
			return false;
		}
		
		if(nums[i]==6){
			return true;
		}
		if(i==nums.length-1){
			return false;
		}
		
		return array6(nums,i+1);
	}


}
