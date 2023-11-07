package W04.Activities;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        long number = sc.nextLong();
        long original = number;

        long reverse = 0;
        long lastDigit = 0;
        
        while (number > 0) {
//            System.out.println("number: " + number);

            lastDigit = number % 10;    // Calculate the last digit of number
            reverse = reverse * 10 + lastDigit;     // Add the lastDig to the end of reverse
            number = number / 10;       // Remove the last digit of number

//            System.out.println("number: " + number + " reverse: " + reverse);
        }

        if (original == reverse)
            System.out.println(original + " is a palindrome number!");
        else
            System.out.println(original + " is not a palindrome number!");
    }    
}
