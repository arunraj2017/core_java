/*
 *Count no of A's in String 
 * 
 * */
package me.learning;

public class Recursion2 {

	public static void main(String[] args) {
		String testStr = "abraCadabra";
		int count = counter(testStr);
		System.out.println(count);
	}

	private static int counter(String testStr) {
		int count = 0;
		if(testStr.length()== 1){
			if(testStr.equals("a")){
				return 1;
			}else{
				return 0;
			}
			
		}
		if(testStr.substring(0, 1).equals("a")){
			count ++;
		}
		
		return count + counter(testStr.substring(1));
	}
}
