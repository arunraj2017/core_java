/**
 * find count of letters between two longest substring
 * */

package me.learning;

public class Recursion3 {
	public static void main(String[] args) {
		int k = strDist("catcowdogfcowcatdogcatcatcat", "cat");
		System.out.println(k);
	}

	private static int strDist(String str, String sub) {
		int count = 0;
		if (str.indexOf(sub) == -1){
			return 0;
		}else{
			int k = str.indexOf(sub);
			//System.out.println(str.substring(0,k));
			if(k>1){
				count = count + str.substring(0,k).length();
			}
			
		}
		
		return ( count + strDist(str.substring((str.indexOf(sub) + sub.length()), str.length()), sub));

	}

}
