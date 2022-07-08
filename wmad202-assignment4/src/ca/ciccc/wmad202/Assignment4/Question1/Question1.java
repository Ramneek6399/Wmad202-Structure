package ca.ciccc.wmad202.Assignment4.Question1;

import java.util.HashSet;
import java.util.Scanner;

public class Question1 {
    public static void list(){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number(enter 0 to exit): ");
        int Number= in.nextInt();

        HashSet<Integer> Numbers= new HashSet<>();
        int sum=0;
            while(Number!=0&&Number!=0){
                if (Numbers.contains(Number)){
                    System.out.println(" Enter another non repeatative number: \n");
                    Number=in.nextInt();
                }

                else if (!Numbers.contains(Number)) {
                    Numbers.add(Number);
                    sum= Number + sum;
                    System.out.println("Enter a Number(enter 0 to exit): ");
                    Number=in.nextInt();}
                }



        System.out.println(Numbers);
        System.out.println(sum);

        }
        }




