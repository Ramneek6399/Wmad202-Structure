package Basics;
import java.util.Scanner;
public class JavaBasics {
    final static int CLUB_AGE = 19;

    public static void isPersonAllowedInClub() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the age : ");
        int age = input.nextInt();

        if (age > CLUB_AGE) {
            System.out.println("You are eligible to go inside");
        } else {
            System.out.println("You are not eligible to go inside");
        }


    }

    public static void evaluate(int grade) {
        if (grade >= 80) {
            System.out.printf("Your grade is very good %d\n", grade);
        } else if (grade >= 60 && grade < 80) {
            System.out.printf("Your grade is good %d\n", grade);
        } else if (grade >= 40 && grade < 60) {
            System.out.printf("Your grade is satisfactory %d\n", grade);
        } else {
            System.out.printf("your are failed %d\n", grade);
        }


    }

    public static float calculateAverage() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int Number = input.nextInt();
        int Counter = 0;
        int Total = 0;

        while (Number != 0) {
            Counter++;
            Total = Total + Number;
            System.out.println("Enter a number: ");
            Number = input.nextInt();
        }

        if (Counter > 0) {
            float Average = (float) Total / Counter;
            System.out.printf("The average is %f", Average);
            return Average;
        } else {
            System.out.println("The user has not entered any number");
            return -1;
        }

    }

    public static char theMinimumChar(String word) {
        char minimum = word.charAt(0);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) <= minimum) {
                minimum = word.charAt(i);

            }

        }
        return minimum;
    }

    public static boolean isNumPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number / i == 0) {
                System.out.println("The number is not prime");
                return true;
            } else {
                System.out.println("The number is prime");
                return false;
            }
        }
        return false;
    }
}













