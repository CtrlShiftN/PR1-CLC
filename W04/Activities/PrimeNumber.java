package W04.Activities;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number = scanner.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {  // for (int i =2; i*i < number; i++)    
            if (number % i == 0) {
                isPrime = false;
                break;
            }            
        }

        if (isPrime == true) {
            System.out.println("It is a prime number.");
        }
        else {
            System.out.println("It is not a prime number.");
        }
    }
    
}
