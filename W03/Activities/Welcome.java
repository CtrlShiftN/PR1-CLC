package W03.Activities;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.next();
        System.out.println("Dear " + name + ", welcome to 62FIT2PR1 subject!");
    }    
}
