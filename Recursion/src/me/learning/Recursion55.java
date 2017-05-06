package me.learning;

public class Recursion55 {


	static int i = 0;
	public static void main(String[] args) {
		String k = "ABCD";
		permute(k, "");
	}

	private static void permute(String text, String constant) {
		if (text.length() == 0) {
			System.out.println(constant);
		} else {
			
			permute(text.substring(0, text.length() - 1), text.substring(text.length() - 1) + constant);
			
				if(constant.length()>1){
					int i = 1;
					constant = swapString(constant, 0, constant.length()-i);
					i++;
					permute(text.substring(0,text.length()-1),text.substring(text.length() - 1)+constant);
					
				}
				
				if(constant.isEmpty() ){
					                
					i++;
					text = swapString(text, 0, text.length()-i);
					if(text.length()!=i){
						permute(text,"");
					}
				}
		}

	}
	
	private static String  swapString(String str, int pos1,int pos2){
		char[] stringArray = str.toCharArray();
		char temp = stringArray[pos1];
		stringArray[pos1] = stringArray[pos2];
		stringArray[pos2] = temp;
		return  String.valueOf(stringArray);
	}

}
