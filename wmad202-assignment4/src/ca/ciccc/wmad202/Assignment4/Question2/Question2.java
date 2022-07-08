package ca.ciccc.wmad202.Assignment4.Question2;

import java.util.*;

public class Question2 {
    public static void words(){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a word(enter exit of terminate): ");
        String word= in.nextLine();

        HashMap <Character,ArrayList<String>> words= new HashMap();
        for (char i ='A'; i<='Z'; i++){
            words.put(i, new ArrayList<>());
        }


        while ( !word.equals("exit")){
            char fristL = word.toUpperCase().charAt(0);
            if (!words.get(fristL).contains(word)){
                words.get(fristL).add(word);
                Collections.sort(words.get(fristL));
            }
            System.out.println(" enter a word :");
            word=in.nextLine();
        }
        System.out.println(words);


    }
}
