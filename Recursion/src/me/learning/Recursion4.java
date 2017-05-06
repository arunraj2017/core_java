package me.learning;

public class Recursion4 {
	public static void main(String[] args) {
		int k = countX("");
		System.out.println(k);
	}

	public static int countX(String str) {
		int count = 0;
		if(str == null|| str.isEmpty()){
			return 0;
		}
		
		if ( str.length() == 1) {
			if (str.equals("x")) {
				return count + 1;
			} else
				return 0;
		}
		if (str.substring(str.length() - 1).equals("x")) {
			count++;
		}

		return count + countX(str.substring(0, str.length() - 1));
	}

}
