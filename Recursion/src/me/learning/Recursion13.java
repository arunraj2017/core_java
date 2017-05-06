/**
 * Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
 * */
package me.learning;

public class Recursion13 {
	public static void main(String[] args) {
		String testStr = "helloasdfsdf";
		System.out.println(allStar(testStr));
	}

	private static String allStar(String str) {
		String output = "";
		if(str.isEmpty() || str.length()==1){
			return str;
		}
		output = str.substring(0,1);
		
		
		return output + "*" +allStar(str.substring(1));
	}

}
