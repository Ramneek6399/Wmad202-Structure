package ca.ciccc.wmad202.Assignment4.Question6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Question6 {
    public static void combinedList() {
        ArrayList<Integer> Number;
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number for list 1: ");
            int num = in.nextInt();
            Number = new ArrayList<>();
            System.out.println("Enter a number for list 1: ");
            while (in.hasNextInt()) {
                Number.add(num);
                System.out.println("Enter a number for list 1: ");
                num = in.nextInt();

            }


        }
        ArrayList<Integer> Number1;
        {
            Scanner r = new Scanner(System.in);
            System.out.println("Enter a number for list 2: ");
            int num1;
            num1 = r.nextInt();
            Number1 = new ArrayList<>();
            Number1.add(num1);
            System.out.println("Enter a number for list 2: ");
            while (r.hasNextInt()) {
                System.out.println("Enter a number for list 2: ");
                num1 = r.nextInt();
                Number1.add(num1);
            }
        }
        ArrayList<Integer> Number2;
        {
            Scanner in2 = new Scanner(System.in);
            System.out.println("Enter a number for list 3: ");
            int num2 = in2.nextInt();
            Number2 = new ArrayList<>();
            Number2.add(num2);
            System.out.println("Enter a number for list 3: ");
            while (in2.hasNextInt()) {
                System.out.println("Enter a number for list 3: ");
                num2 = in2.nextInt();
                Number2.add(num2);

            }

            System.out.println(Number);
            System.out.println(Number1);
            System.out.println(Number2);
            HashSet<Integer> input = new HashSet<>();
            for (Integer i : Number) {
                input.add(i);
            }
            for (Integer i : Number1) {
                input.add(i);
            }
            for (Integer i : Number2) {
                input.add(i);
            }
            System.out.println(" The combined list for the above input lists is: ");
            System.out.println(input);
        }
    }
}