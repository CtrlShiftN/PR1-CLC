package W03.Activities;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three number a, b and c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double x1, x2, delta;
        
        if ((a == 0) && (b == 0) && (c == 0))
            System.out.println("The equation has infinitely many roots");
        else if ((a == 0) && (b == 0))
            System.out.println("The equation has no root");
        else if (a == 0) {
            System.out.println("The equation has one root");
            x1 = -c/b;
            System.out.println("x =" + x1);
        }            
        else {
            delta = b*b - 4*a*c;
            if (delta < 0) 
                System.out.println("The equation has no real root");
            else if (delta == 0) {
                System.out.println("The equation has one root");
                x1 = -b/(2*a);
                System.out.println("x =" + x1);                
            }
            else {
                System.out.println("The equation has two roots");
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("x1 =" + x1);
                System.out.println("x2 =" + x2);
            }
        }
    }    
}
