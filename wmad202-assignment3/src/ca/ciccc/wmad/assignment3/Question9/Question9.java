package ca.ciccc.wmad.assignment3.Question9;

import ca.ciccc.wmad.assignment3.Question1.Question1;

import java.util.ArrayList;
import java.util.Scanner;


import static ca.ciccc.wmad.assignment3.Question1.Question1.isPrime;

public class Question9 {
    public static void thePrimeInList(){
        Scanner in= new Scanner(System.in);
        ArrayList<Integer> Numbers= new ArrayList<>();
        System.out.println(" Enter a positive number: ");
        while (in.hasNextInt()) {
            int Num = in.nextInt();
            Numbers.add(Num);
            System.out.println(" Enter a positive number: ");
        }

        Scanner s= new Scanner (System.in);
        System.out.println(" Enter the index: ");
        int index=s.nextInt();
        int count=0;
        for( int i= index; i>=0; i--){
            if(isPrime(Numbers.get(i))){
                count++;
            }

        }
        System.out.printf("The count of the index that are prime:%d", count);

    }
}
