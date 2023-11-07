package tut05;

import java.util.Scanner;

public class NumberList {
	public static double[] promtList() {
		Scanner sc = new Scanner(System.in);
		// get the amount of numbers in the list
		System.out.println("How many number?");
		int amount = sc.nextInt();
		double[] numberArr = new double[amount];
		// Request user to promt numbers list
		System.out.println("Enter a list of " + amount + " numbers:");
		for (int i = 0; i < amount; i++) {
			numberArr[i] = sc.nextDouble();
		}
		return numberArr;
	}

	public static double findAvarage(double[] numArr) {
		double sum = 0;
		int noOfNum = numArr.length;
		for (int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		return sum / noOfNum;
	}

	public static double findMax(double[] numArr) {
		double max = numArr[0];
		for (int i = 1; i < numArr.length; i++) {
			if (numArr[i] > max) {
				max = numArr[i];
			}
		}
		return max;
	}

	public static double findMin(double[] numArr) {
		double min = numArr[0];
		for (int i = 1; i < numArr.length; i++) {
			if (numArr[i] < min) {
				min = numArr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// Get numbers list
		double[] numList = promtList();
		// Print numbers from the list
		System.out.println("The list of number:");
		for (int i = 0; i < numList.length; i++) {
			System.out.print(numList[i] + " ");
		}
		System.out.println();
		// Find avarage, min, max then print out
		double avarage = findAvarage(numList);
		double min = findMin(numList);
		double max = findMax(numList);
		System.out.println("The average value of the numbers is: " + avarage);
		System.out.println("The maximum value of the numbers is: " + max);
		System.out.println("The minimum value of the numbers is: " + min);
		System.out.println("The range value is from: " + min + " to " + max);
	}

}
