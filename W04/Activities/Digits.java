package W04.Activities;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = sc.nextInt();

        // If number is negative, we multiply it by -1
        if (number < 0)
            number = -number;

        // Find out the number of digits 
        int numDigits = 1;
        int lowerBound = 10;
        while (number >= lowerBound) {
            numDigits++;
            lowerBound = lowerBound * 10;
        }            
        System.out.println("The integer " + number + " has " + numDigits + " digit(s)");    
    }    
}
