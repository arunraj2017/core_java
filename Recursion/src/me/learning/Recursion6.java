package me.learning;

public class Recursion6 {

	public static void main(String[] args) {
		String k = "xxhixx";
		System.out.println(changeXY(k));
		
	}

	private static String changeXY(String k) {
		String ret = "";
		if(k.length()==1){
			if(k.equals("x")){
				return "y";
			}else{
				return k;
			}
		}
			if(k.substring(0, 1).equals("x")){
				ret = "y";
			}else{
				ret = k.substring(0, 1);
			}
		
		
		
		return ret + changeXY(k.substring(1,k.length()));
	}


}
