package W02.Activities;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base and the height of the area: ");
        double b = scanner.nextDouble();
        double h = scanner.nextDouble();
        
        double a = 0.5*b*h;
        System.out.println("The triangle's base is " + b + " (cm) and height is " + h + " (cm).");
        System.out.println("Its area (cm2) is:");
        System.out.println(a);
        
    }    
}
