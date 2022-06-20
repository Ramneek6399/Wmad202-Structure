package ca.ciccc.wmad.assignment3.Question2;

import ca.ciccc.wmad.assignment3.Question1.Question1;

import java.util.Scanner;

public class Question2 {
    public static void theNextPrimeNum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int Number = in.nextInt();

        int newNum = Number + 1;
        while(!Question1.isPrime(newNum)){
                newNum++;



            }
        System.out.printf("The next prime number is %d\n", newNum);

            }

    }