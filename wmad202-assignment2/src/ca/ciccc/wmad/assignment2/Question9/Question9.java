package ca.ciccc.wmad.assignment2.Question9;

import java.util.Scanner;

public class Question9 {
    public static void stringCheck() {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = in.nextLine();

        if(name.matches("[a-zA-Z]+")) {
            while(name.matches("[a-zA-Z]+")) {
                String uppercase = name.toUpperCase();
                System.out.printf("Result : %s\n", uppercase);
                System.out.println("Enter a name: ");
                name = in.next();
            }}

        System.out.println("invalid");



    }
}
