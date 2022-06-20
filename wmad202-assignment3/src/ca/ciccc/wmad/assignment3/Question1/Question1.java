package ca.ciccc.wmad.assignment3.Question1;

import java.util.Scanner;

public class Question1 {
    public static boolean isNumPrime() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int Number = in.nextInt();
        return isPrime(Number);
    }


    public static boolean isPrime(int Number){
            for (int i = 2; i < Number; i++) {
                if (Number % i == 0) {
                    return false;


                }}


            return true;

        }

    }

