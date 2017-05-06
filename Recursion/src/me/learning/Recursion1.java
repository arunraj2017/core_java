/*
 *Factorial
 * */
package me.learning;

import java.io.IOException;

public class Recursion1 {
	
	public static void main(String[] args) throws IOException {
		int fact = 5;
		int value = fact(fact);
		System.out.println(value);
	}

	private static int fact(int fact) {
		if(fact <=1){
			return 1;
		}
		return fact * fact(fact-1);
	}

}
