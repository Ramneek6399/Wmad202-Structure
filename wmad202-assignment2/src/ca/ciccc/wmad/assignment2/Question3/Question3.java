package ca.ciccc.wmad.assignment2.Question3;

import java.util.Scanner;

public class Question3 {

    public static void DecimalIntoBinary() {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int Number= input.nextInt();
        String Result="";
        int Div= Number/2;
        int Rem= Number%2;
        Result= String.valueOf(Rem).concat(Result);

        while (Div !=0) {
            Rem = Div / 2;
            Div = Div / 2;
            Result = String.valueOf(Rem).concat(Result);
        }

        System.out.printf("The binary no. is %s", Result);








    }
    }



