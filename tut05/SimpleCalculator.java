package tut05;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an expression:");
		double firstOperand = sc.nextDouble();
		char operator = sc.next().charAt(0);
		double secondOperand = sc.nextDouble();
		String result;
		switch (operator) {
		case '+':
			result = "" + (firstOperand + secondOperand);
			break;
		case '-':
			result = "" + (firstOperand - secondOperand);
			break;
		case '*':
			result = "" + (firstOperand * secondOperand);
			break;
		case '/':
			result = "" + (firstOperand / secondOperand);
			break;
		default: {
			result = "Illegal";
		}
		}
		System.out.println(firstOperand + " " + operator + " " + secondOperand + " = " + result);
	}
}
