package W04.Activities;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        long fact = 1;
        if (n > 0) {
            for (int i = n; i > 0; i--)
                fact = fact * i;
        }
        System.out.println("The factorial of " + n + " is:");
        System.out.println(fact);    
    }    
}
