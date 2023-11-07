package W02.Activities;

import java.util.Scanner;

public class CoinExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount of money in xu: ");
        int money = scanner.nextInt();

        int quan = money / 10000;
        money = money - quan * 10000;
        int dong = money / 100;
        money = money - dong * 100; 
        int hao = money / 10;
        money = money - hao * 10;
        System.out.println(quan + " quan, " + dong + " dong, " + hao + " hao, " + money + " xu");
    }    
}
