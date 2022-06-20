package ca.ciccc.wmad.assignment3.Question5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
    public static void theRepeatedNumber(){
        Scanner in= new Scanner(System.in);
        ArrayList<Integer> Numbers= new ArrayList< >();
        int[] frequencies = new int[100];


        System.out.println("Please enter a number: ");
        while (in.hasNextInt()){
            int NNumber= in.nextInt();
            Numbers.add(NNumber);
            System.out.println("Please enter a number: ");
        }

        for (Integer Number : Numbers){
            frequencies[Number]++;}

        //System.out.printf("Frequency: %s\n", Arrays.toString(frequencies));


        for (int i=1; i< frequencies.length; i++ ) {
                System.out.printf("%d is repeated %d times\n", i,frequencies[i]);
            }
        }







    }


