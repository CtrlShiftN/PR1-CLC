package W01.Activities;

public class PrintMyAge {
    public static void main(String[] args) {
        int myYob = 2004;
        int currentYear = 2023;
        System.out.println("I was born in " + myYob + ". This year is " + currentYear + ".");
        System.out.println("Therefore, my age is:");
        System.out.println(currentYear - myYob);
    }
}
