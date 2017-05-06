package me.learning;

public class Recursion7 {

	public static void main(String[] args) {
		String k = "pipi";
		System.out.println(changePi(k));
		
	}

	private static String changePi(String str) {
		String ret = "";
		String next = "";
		if(str.length()==0){
			return str;
		}
		
		if(str.substring(0,1).equals("p")){
			if(str.length()>1){
				if(str.substring(1,2).equals("i")){
					ret = "3.14";
					next = str.substring(2);
				}
			}else{
				ret = str;
			}
		}else{
			ret = str.substring(0,1);
			next = str.substring(1);
		}
		return ret+changePi(next);
	}
}
