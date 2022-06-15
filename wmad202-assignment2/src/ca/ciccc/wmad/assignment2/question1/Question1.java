package ca.ciccc.wmad.assignment2.question1;

public class Question1 {
    public static void NumDivisibleBy3and5(int num1, int num2) {
        for (int i = num1 + 1; i < num2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("Numbers divisible by 3 and 5 %d\n", i);
            }
        }
    }

    public static void NumDivisibleBy6or7(int num1, int num2) {
        for (int i = num1 + 1; i < num2; i++) {
            if (i % 6 == 0 || i % 5 == 0) {

                System.out.printf("Numbers divisible by 6 or 7 %d\n", i);
            }
        }
    }

    public static void NumNotDivisibleby3(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            if (i % 3 != 0) {
                System.out.printf("Numbers not divisible by 3\n %d\n", i);
            }
        }
    }

}