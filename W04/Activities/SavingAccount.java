package W04.Activities;
import java.util.Scanner;
public class SavingAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much money?");
        double m = sc.nextDouble();
        System.out.println("How many years do you want to deposit your money?");
        int y = sc.nextInt();
        System.out.println("What's the interest rate per year (%)?");
        double r = sc.nextDouble();

        double interest = 1;
        for (int i = 1; i <= y; i++)
            interest = interest * (1 + r / 100);
        
        double money = m * interest;
        System.out.println("After " + y + " years, you'll receive " + money);
    }    
}
