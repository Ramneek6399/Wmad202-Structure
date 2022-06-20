package ca.ciccc.wmad.assignment3.Question3;

import java.security.PublicKey;
import java.util.Scanner;

public class Question3 {


    public static void printPattern() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int Number = in.nextInt();
        System.out.println("Enter a pattern (Shape1, Shape2 or Shape3): ");
        String Pattern = in.next();

        switch (Pattern) {
            case "SHAPE1" -> Shape1(Number);
            case "SHAPE2" -> Shape2(Number);
            case "SHAPE3" -> Shape3(Number);


        }
    }


    private static void Shape1(int Number) {
        int blank = 0;
        for (int i = Number; i >= 0; i -= 2) {

            for (int i1 = 0; i1 < blank; i1++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");


            }
            System.out.println(" ");
            blank++;


        }

    }

    private static void Shape2(int Number) {
        for (int i = Number; i >= 0; i --) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }

    private static void Shape3(int Number) {
        for (int i = 0; i < Number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}



