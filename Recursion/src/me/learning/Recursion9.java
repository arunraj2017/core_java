package me.learning;

public class Recursion9 {
	
	public static void main(String[] args) {
		System.out.println(noX("xaxb"));
		
	}
	
	public static String noX(String str) {
		String strr = "";
		if(str.length()==0){
			return str;
		}
		
		if(str.substring(0, 1).equals("x")){
			strr = "";
		}else{
			strr = str.substring(0, 1);
		}
		str= str.substring(1, str.length());
		
		return strr + noX(str.substring(0));
		  
	}


}
