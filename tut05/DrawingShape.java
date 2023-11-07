package tut05;

import java.util.Scanner;

public class DrawingShape {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select an option to draw:\r\n" + "1. Solid quare\r\n" + "2. Hollow quare\r\n"
				+ "3. Solid triangle\r\n" + "How many rows?");
		int option = sc.nextInt();
		int row = sc.nextInt();
		switch (option) {
		case 1:
			// Solid Square
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < row; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 2:
			// Hollow quare
			// First solution (Easy way but long code)
//				// first row
//				for (int i = 0; i < row; i++) {
//					System.out.print("*");
//				}
//				System.out.println();
//				// middle
//				for(int i = 1; i < row - 1; i++) {
//					for (int j = 0; j < row; j++) {
//						if (j == 0 || j == row - 1) {
//							System.out.print("*");
//						}else {
//							System.out.print(" ");
//						}
//					}
//					System.out.println();
//				}
//				// last row
//				for (int i = 0; i < row; i++) {
//					System.out.print("*");
//				}
//				System.out.println();
			// Second solution (Hard way and short code)
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < row; j++) {
					if ((i == 0) || i == row - 1 || j == 0 || j == row - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 3:
			// Solid triangle
			for (int i = 0; i < row; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		default: {
			System.err.println("The option is not available!");
			break;
		}
		}
	}

}
