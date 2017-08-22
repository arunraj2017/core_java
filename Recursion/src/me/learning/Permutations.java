package me.learning;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	private static final String test = "ABCD";
	
	static List<String> permutations = new ArrayList<String>();

	public static void main(String[] args) {

		permute(test, 0, test.length() - 1);
		System.out.println(permutations);
	}

	private static void permute(String str, int l, int r) {

		if (l == r) {
			//System.out.println(str);
			permutations.add(str);
		} else {

			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}

	}

	private static String swap(String str, int i, int l) {

		char[] arr = str.toCharArray();
		char temp = arr[i];
		arr[i] = arr[l];
		arr[l] = temp;
		return String.copyValueOf(arr);

	}

}
