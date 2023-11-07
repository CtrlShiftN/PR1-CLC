package W02.Activities;

import java.util.Scanner;

public class NumberLabel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a floating-point number: ");
        double a = scanner.nextDouble();

        if (a < -1000000)
            System.out.println("A large negative number.");
        if ((-1000000 <= a) && (a <= -1))
            System.out.println("A negative number.");
        if ((-1 < a) && (a < 0))
            System.out.println("A small negative number.");
        if (a == 0)
            System.out.println("The number is zero.");
        if ((0 < a) && (a < 1))
            System.out.println("A small positive number.");
        if ((1 <= a) && (a <= 1000000))
            System.out.println("A positive number.");
        if (a > 1000000)
            System.out.println("A large positive number.");
                
    }    
}
