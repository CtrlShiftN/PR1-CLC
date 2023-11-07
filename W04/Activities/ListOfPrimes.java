package W04.Activities;

import java.util.Scanner;

public class ListOfPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start, stop;
        
        System.out.println("Enter start and stop values:");
        start = sc.nextInt();
        stop = sc.nextInt();

        boolean isPrime;

        for (int number = start; number <= stop; number ++) {
            isPrime = true;
            for (int i = 2; i < number; i++) {   
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }            
            }
            if (isPrime == true) 
                System.out.print(number + " ");            
        }
        System.out.println();
    }
}
