package W04.Activities;

import java.util.Scanner;

public class SumIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum = sum + i;
        System.out.println("The sum from 1 to " + n + " is:");
        System.out.println(sum);    
    }    
}
