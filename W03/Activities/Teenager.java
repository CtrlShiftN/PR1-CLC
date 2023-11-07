package W03.Activities;

import java.util.Scanner;

public class Teenager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if (age < 13)
            System.out.println("Not for kids");
        else if (age <=19)
            System.out.println("Welcome, teenager");
        else
            System.out.println("You're too old");
    }    
}
