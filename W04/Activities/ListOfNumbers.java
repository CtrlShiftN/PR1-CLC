package W04.Activities;

import java.util.Scanner;

public class ListOfNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number;
        int[] list = new int[100];
        int length = 0;

        System.out.println("Enter a list of numbers ending with 0:");
        do {
            number = sc.nextInt();
            if (number != 0) {
                list[length] = number;
                length++;
            }
            
        } while (number != 0);
        
        System.out.println("You have entered " + length + " numbers. They are:");
        for (int i = 0; i < length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }    
}
