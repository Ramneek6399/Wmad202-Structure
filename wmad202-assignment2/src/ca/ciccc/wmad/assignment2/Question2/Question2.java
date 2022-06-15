package ca.ciccc.wmad.assignment2.Question2;

import java.util.Scanner;

public class Question2 {
    public static void reverseNum() {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int Number =input.nextInt();

        while (Number%10== 0){
            System.out.println("Enter a whole number: ");
            Number =input.nextInt();  }

        int div= Number/10;
        int rem= Number%10;
        System.out.printf("%d",rem);

        while(div!=0) {
            rem = div % 10;
            div = div / 10;
            System.out.printf("%d", rem);
        }


        }






    }



