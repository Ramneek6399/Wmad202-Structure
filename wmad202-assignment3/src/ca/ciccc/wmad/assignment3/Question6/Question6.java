package ca.ciccc.wmad.assignment3.Question6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Question6 {
    public static void theRepeatedNumber() {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> Numbers = new ArrayList<>();


        System.out.println("Please enter a number: ");
        while (in.hasNextInt()) {
            int NNumber = in.nextInt();
            if (!Numbers.contains(NNumber)) {
                Numbers.add(NNumber);
            }

            System.out.println("Please enter a number: ");
        }
        System.out.println("The elements of the list are: ");
        for ( Integer Num :Numbers){

            System.out.printf("%d\n", Num );
    }
}

    }