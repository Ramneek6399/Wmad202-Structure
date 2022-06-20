package ca.ciccc.wmad.assignment3.Question8;

import java.util.ArrayList;
import java.util.Scanner;

public class Question8 {
    public static void Nums(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 40 and 100: ");
        int toplimit= in.nextInt();

        if (toplimit<40||100< toplimit){
            System.out.println("You entered a valid number");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a second number: ");
        int number= input.nextInt();
        ArrayList<Integer> Numbers= new ArrayList<>();

        for (int i =2; i<=toplimit; i++){
            if (number%i== 0){
                Numbers.add(i);
                }

            }
        System.out.println(" The list of divisible numbers is ");
        for (Integer num: Numbers){
        System.out.printf("%d\n", num);
        }}

    }

