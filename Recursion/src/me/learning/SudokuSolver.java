package me.learning;

import java.io.IOException;
import java.util.Scanner;

//Sudoku Solver

public class SudokuSolver {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int output = 0;
		int ip1_rows = 0;
		int ip1_columns = 0;
		// ip1_rows = Integer.parseInt(in.nextLine().trim());
		// ip1_columns = Integer.parseInt(in.nextLine().trim());
		// int[][] ip1 = new int[ip1_rows][ip1_columns];
		/*
		 * for (int ip1_i = 0; ip1_i < ip1_rows; ip1_i++) { for (int ip1_j = 0;
		 * ip1_j < ip1_columns; ip1_j++) { ip1[ip1_i][ip1_j] = in.nextInt(); } }
		 */
		int[][] ip1 = { 
						{ 2, 0, 1, 0 }, 
						{ 0, 3, 0, 0 }, 
						{ 0, 0, 4, 0 },
						{ 0, 2, 0, 1 } };

		int[][] ip = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 },
				{ 0, 0, 0, 0 } };

		/*
		 * { [1,3,4,2] [2,4,3,1] [3,1,2,4] [4,2,1,3]
		 * 
		 * }
		 */

		output = SolveMagicSquare(ip1);
		// System.out.println(String.valueOf(output));
	}

	private static int SolveMagicSquare(int[][] ip1) {

		int[][] finalArr = solve(0, 0, ip1);

		for (int ip1_i = 0; ip1_i < finalArr.length; ip1_i++) {
			System.out.println("\n");
			for (int ip1_j = 0; ip1_j < finalArr[0].length; ip1_j++) {
				System.out.print(finalArr[ip1_i][ip1_j] + " ");
			}
		}
		return 0;
	}

	private static int[][] solve(int row, int col, int[][] ip1) {

		System.out.println("(" + row + " , " + col + ")");

		if ((row >= ip1.length)) {

			return ip1;
		}

		if ((ip1[row][col] == 0)) {
			for (int i = 1; i <= ip1.length; i++) {
				if (!checkPresense(i, row, col, ip1)) {
					ip1[row][col] = i;

					if (col == ip1.length - 1) {
						solve(row + 1, 0, ip1);
					}else{
						solve(row, col + 1, ip1);
					}
				}
				
				if(!checkZero(ip1)){
					return ip1;
				}
				
				if(i==4){
					if(checkPresense(i, row, col, ip1)){
						ip1[row][col] = 0;
					}
				}

			}

		} else {

			if(col >=ip1.length-1){
				solve(row+1, 0, ip1);
			}else{
				solve(row, col + 1, ip1);
			}
		}

		return ip1;
	}

	private static boolean checkZero(int[][] ip1) {
		boolean retval = false;
		for(int i = 0; i<ip1.length;i++){
			for(int j = 0 ; j < ip1.length; j ++){
				if(ip1[i][j]==0){
					retval = true;
					break;
				}
			}
		}
		
		return retval;
	}

	private static boolean checkRows(int val, int x, int y, int[][] arr) {
		boolean retVal = false;
		for (int i = 0; i < arr.length; i++) {
			if (val == arr[i][y]) {
				retVal = true;
				break;
			}
		}

		return retVal;
	}

	private static boolean checkColumn(int val, int x, int y, int[][] arr) {

		boolean retVal = false;
			for (int j = 0; j < arr.length; j++) {
				if (val == arr[x][j]) {
					retVal = true;
					break;
				}
			}

		return retVal;
	}

	private static boolean checkSquare(int val, int x, int y, int[][] arr) {
		int rx = (int) Math.sqrt(arr.length);

		int sCol = y / rx;
		int sRow = x / rx;

		boolean isPresent = false;
		for (int i = 0; i < arr.length; i++) {
			if ((!isPresent) && (i / rx == sRow)) {

				for (int j = 0; j < arr.length; j++) {
					if (j / rx == sCol) {

						// code to iterate small squares to find the value
						if ((i != x) && (j != y)) {
							if (val == arr[i][j]) {
								isPresent = true;
								break;
							}
						}
					}

				}

			}

		}

		return isPresent;
	}

	private static boolean checkPresense(int val, int x, int y, int[][] arr) {
		boolean ispresent = true;
		
		if (!checkRows(val, x, y, arr)) {
			if (!checkColumn(val, x, y, arr)) {
				ispresent = checkSquare(val, x, y, arr);
			}
		}
		return ispresent;
	}
	

}
