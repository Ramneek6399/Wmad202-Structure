package ca.ciccc.wmad.assignment2.Question5;

import java.util.Scanner;
import java.util.Scanner;
public class Question5 {


        public static void printReversedString() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String word = input.nextLine();

            if (word.matches("[a-zA-Z]+")){
            String result= " ";
                for (int i= word.length()-1; i>=0; i--){
                    result= result.concat(String.valueOf(word.charAt(i)));
                }

            System.out.printf("%s", word);
            System.out.printf(result);




                }


            }


        }



