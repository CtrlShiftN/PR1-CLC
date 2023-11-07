package W04.Activities;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int n = sc.nextInt();

        int[] fList = new int[n];
        fList[0] = 0;
        fList[1] = 1;
        for (int i = 2; i < n; i++) {
            fList[i] = fList[i-1] + fList[i-2];
        }
        System.out.println("The list of " + n + " numbers in the Fibonacci series:");
        for (int i = 0; i < n; i++)
            System.out.print(fList[i] + " ");
        System.out.println();    
    }    
}
