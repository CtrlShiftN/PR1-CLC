package W04.Examples;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        int count, number;
        System.out.println("Enter a number");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();

        count = 1;
        while (count <= number) {
            System.out.print(count + ", ");
            count++;
        }

        System.out.println("\n");
        System.out.println("Buckle my shoe.");
    }
}