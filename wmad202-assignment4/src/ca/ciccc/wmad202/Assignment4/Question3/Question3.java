package ca.ciccc.wmad202.Assignment4.Question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Question3 {
    public static void intlist(){
        Scanner in= new Scanner(System.in);
        System.out.println(" enter a number ");
        int num= in.nextInt();

        HashMap<Integer, ArrayList<Integer>> Numbers= new HashMap<>();

        for (int i=2; i<= 9; i++){
            Numbers.put(i, new ArrayList<>());
        }
        if (num>50){
            for(int i =2; i<=9; i++){
                for( int j=2; j<= num; j++){
                    if (j%i == 0){
                    Numbers.get(i).add(j);
                        Collections.sort(Numbers.get(i));
                    }
                }
                for (Integer I : Numbers.keySet()){
                    System.out.println(I);;
            }


        }

        }
        }
    }
