package ca.ciccc.wmad.assignment3.Question7;

import java.util.ArrayList;
import java.util.Scanner;

public class Question7 {
    public static int linearSearch(){
        Scanner in= new Scanner(System.in);
        ArrayList<Integer> Numbers= new ArrayList<>();
        System.out.println("Enter a number: ");
        while (in.hasNextInt()){
            int NNum= in.nextInt();
            Numbers.add(NNum);
            System.out.println("Enter a number: ");
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the search number: ");
        int Search= input.nextInt();

        for( int i=0; i< Numbers.size(); i++){
            if (Search == Numbers.get(i)){
                System.out.printf("The index is : %d", i);
                }

            }
        return -1;
    }

    }

