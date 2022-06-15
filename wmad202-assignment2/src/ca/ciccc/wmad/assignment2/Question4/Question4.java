package ca.ciccc.wmad.assignment2.Question4;

import java.util.Scanner;

public class Question4 {
    public static void MaxAndMin() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int Number = input.nextInt();
        int Maximum = Number;
        int Minimum = Number;
        System.out.println("Enter the number: ");

        while (input.hasNextInt()) {

            Number = input.nextInt();
            if (Maximum < Number) {
            Maximum = Number;
            }

            if (Minimum > Number) {
                Minimum = Number;
            }
            System.out.println("Enter the number: ");
        }


        int abs= Maximum-Minimum;
        System.out.printf("Maximum %d, Minimum %d, absolute value is %d ", Maximum, Minimum, abs);

        }


    }










