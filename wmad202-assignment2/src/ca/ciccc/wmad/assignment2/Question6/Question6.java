package ca.ciccc.wmad.assignment2.Question6;

import java.util.Scanner;

public class Question6 {
    public static void check() {

        int openparanthesis = 0;
        int closeparanthesis = 0;
        boolean isvalidStatement = true;
        Scanner in = new Scanner(System.in);
        String statement = in.nextLine();


        for (int i = 0; i < statement.length(); i++) {
            if (statement.charAt(i) == '(') {
                openparanthesis++;
            } else if (statement.charAt(i) == ')') {
                closeparanthesis++;
            }


            if (openparanthesis < closeparanthesis) {
                isvalidStatement = false;
                break;

            }
        }

        if (openparanthesis != closeparanthesis) {
                isvalidStatement = false;
            }
        if (isvalidStatement) {
            System.out.println("The statement is valid");
        } else {
            System.out.println("The statement is invalid");
            }
        }
    }











