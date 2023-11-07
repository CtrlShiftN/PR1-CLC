package W02.Activities;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int max = a;        
        if (max < b)
            max = b;
        if (max < c)
            max = c;
        System.out.println("Among " + a + ", " + b + " and "+ c + ", the largest is " + max + ".");
    }    
}
