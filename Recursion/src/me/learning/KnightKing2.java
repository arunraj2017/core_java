package me.learning;

import java.io.IOException;
import java.util.Scanner;

public class KnightKing2 {
	private static int tempCount = 0;

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int ip1 = Integer.parseInt(in.nextLine().trim());
		int ip2 = Integer.parseInt(in.nextLine().trim());
		int ip3 = Integer.parseInt(in.nextLine().trim());
		int ip4 = Integer.parseInt(in.nextLine().trim());
		in.close();
		int output = getStepCount(ip1, ip2, ip3, ip4);
		System.out.println("Shortest Path :" + tempCount);
		
	}

	// 2 1 6 5 -> 4
	// 6 6 5 5 -> 2

	public static int getStepCount(int input1, int input2, int input3, int input4) {
		return recurse(0, input1, input2, input3, input4);

	}

	private static int recurse(int count, int tx, int ty, int kx, int ky) {

		if (isSolved(tx, ty, kx, ky)) {
			int ccount = count+1;
			System.out.println("COUNT: "+count+"--"+tx+","+ty+","+ccount);
			if((tempCount==0) || (ccount<=tempCount)){
				tempCount = ccount;
			}
			return ccount;
		}

			if ((tempCount==0 || count < tempCount) && ((tx < kx+2) && (ty < ky+2))) {
				if (!(tx + 2 > 8) && !(ty + 1 > 8)) {
					rightTop(count, tx, ty, kx, ky);
					
				}
				if (!(tx + 2 > 8) && !(ty - 1 < 0)) {
					rightBottom(count, tx, ty, kx, ky);
				}
				if (!(tx + 1 > 8) && !(ty + 2 > 8)) {
					topRight(count, tx, ty, kx, ky);
				}
				if (!(tx - 1 < 0) && !(ty + 2 > 8)) {
					topLeft(count, tx, ty, kx, ky);
				}
				if (!(tx + 1 > 8) && !(ty - 2 < 0)) {
					 bottomRight(count, tx, ty, kx, ky);
				}
				if (!(tx - 1 < 0) && !(ty - 2 < 0)) {
					 bottomLeft(count, tx, ty, kx, ky);
				}
				if (!(tx - 2 < 0) && !(ty + 1 > 8)) {
					leftTop(count, tx, ty, kx, ky);
				}
				if (!(tx - 2 < 0) && !(ty - 1 < 0)) {
					leftBottom(count, tx, ty, kx, ky);
				}
			}

		return count;

	}

	private static int rightTop(int count, int tx, int ty, int kx, int ky) {
		return count + recurse(count + 1, tx + 2, ty + 1, kx, ky);

	}

	private static int topRight(int count, int tx, int ty, int kx, int ky) {
		return count + recurse(count + 1, tx + 1, ty + 2, kx, ky);
	}

	private static int rightBottom(int count, int tx, int ty, int kx, int ky) {
		return count + recurse(count + 1, tx + 2, ty - 1, kx, ky);
	}

	private static int bottomRight(int count, int tx, int ty, int kx, int ky) {
		return count + recurse(count + 1, tx + 1, ty - 2, kx, ky);
	}

	private static int topLeft(int count, int tx, int ty, int kx, int ky) {
		return count + recurse(count + 1, tx - 1, ty + 2, kx, ky);
	}

	private static int bottomLeft(int count, int tx, int ty, int kx, int ky) {
		return count + recurse(count + 1, tx - 1, ty - 2, kx, ky);
	}

	private static int leftTop(int count, int tx, int ty, int kx, int ky) {
		return count + recurse(count + 1, tx - 2, ty + 1, kx, ky);
	}

	private static int leftBottom(int count, int tx, int ty, int kx, int ky) {
		return count + recurse(count + 1, tx - 2, ty - 1, kx, ky);
	}

	private static boolean isSolved(int tx, int ty, int kx, int ky) {
		boolean solved = false;
		if ((tx == kx) && (ty == ky)) {
			solved = true;
		} else if ((tx + 2 == kx) && (ty + 1 == ky)) { // right top
			solved = true;
		} else if ((tx + 2 == kx) && (ty - 1 == ky)) { // right bottom
			solved = true;
		} else if ((ty + 2 == ky) && (tx + 1 == kx)) {// top right
			solved = true;
		} else if ((ty + 2 == ky) && (tx - 1 == kx)) {// top left
			solved = true;
		} else if ((tx - 2 == kx) && (ty + 1 == ky)) { // left top
			solved = true;
		} else if ((tx - 2 == kx) && (ty - 1 == ky)) {// left bottom
			solved = true;
		} else if ((ty - 2 == ky) && (tx + 1 == kx)) { // bottom right
			solved = true;
		} else if ((ty - 2 == ky) && (tx - 1 == kx)) { // bottom left
			solved = true;
		}
		
		return solved;
	}

}
