package ca.ciccc.wmad.assignment3.Question4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
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

        System.out.printf("Frequency: %s\n", Arrays.toString(frequencies));

        int mostRepeated= 0;
        int mostRepeatedNum=0;

        for (int i=1; i< frequencies.length; i++ ) {
            if (mostRepeated < frequencies[i]) {
                mostRepeatedNum = i;
                mostRepeated = frequencies[i];
                System.out.printf("The repeated number is: %d\n", mostRepeatedNum);
            }
        }







        }
    }

