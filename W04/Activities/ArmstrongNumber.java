package W04.Activities;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int firstDigit, secondDigit, thirdDigit;
        int sumOfDigits;
        for (int number = 100; number <= 999; number ++) {
            firstDigit = number / 100;
            secondDigit = (number % 100) / 10;
            thirdDigit = number % 10;
            sumOfDigits = firstDigit*firstDigit*firstDigit + secondDigit*secondDigit*secondDigit + thirdDigit*thirdDigit*thirdDigit;
            if (sumOfDigits == number)
                System.out.print(number + " ");
        }
        System.out.println();
    }    
}
