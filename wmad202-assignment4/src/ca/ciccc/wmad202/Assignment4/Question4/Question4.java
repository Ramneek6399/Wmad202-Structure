package ca.ciccc.wmad202.Assignment4.Question4;

import java.security.Key;
import java.util.*;

public class Question4 {
    public static void list() {


            Scanner in = new Scanner(System.in);
            System.out.println(" Enter a number : ");
            int num = in.nextInt();

            ArrayList<Integer> Numbers = new ArrayList<>();

            while(num!=0){
            if(in.hasNextInt()){
                Numbers.add(num);
                System.out.println(" Enter a number : ");
                num = in.nextInt();
            }}
            System.out.println(Numbers);



        HashMap<Integer,Integer> Numeric= new HashMap<>();



        for (Integer i: Numbers){
            if (Numeric.containsKey(i)) {
                Numeric.remove(i);

            }
            else if(!Numeric.containsKey(i)){
                Numeric.put(i,1);

            }



        }
        for (Integer i: Numeric.keySet()){
            System.out.println(i);
        }


    }
}
