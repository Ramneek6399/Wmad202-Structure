package ca.ciccc.wmad202.Assignment4.Question5;

import java.util.ArrayList;
import java.util.HashMap;

public class Question5 {
    public ArrayList<HashMap<Character,Integer>> sampleList(){
        ArrayList<HashMap<Character, Integer>> List = new ArrayList<>();
        List.add(samplepoint(1, 4, 1));
        List.add(samplepoint(3, 7, 10));
        List.add(samplepoint(-1, 3, 4));
        List.add(samplepoint(4, 4, 2));
        List.add(samplepoint(7, -4, 0));


        return List;
    }
       private static HashMap<Character,Integer> samplepoint(int x, int y, int z) {
           HashMap<Character, Integer> Point = new HashMap<>();
           Point.put('x', x);
           Point.put('y', y);
           Point.put('z', z);


           return Point;
       }
       private static HashMap<Character,Integer> centre(){
        HashMap<Character,Integer> centrepoint= new HashMap<>();
        centrepoint.put('x', 0);
        centrepoint.put('y', 0);
        centrepoint.put('z', 0);

           return centrepoint;
       }
       private float calculateDistance(HashMap<Character,Integer>p1, HashMap<Character,Integer>p2){
        float result= (float) (Math.sqrt(Math.pow(p1.get('x')- p2.get('x'), 2)) + Math.pow(p1.get('y') - p2.get('y'), 2) + Math.pow(p1.get('z') - p2.get('z'), 2));

           return result;
       }
       public void minDistance(){
           HashMap<Character,Integer>  closestPoint= sampleList().get(0);
           double minDist= calculateDistance(sampleList().get(0),centre());

           for (int i= 0; i<sampleList().size(); i++){
               if (calculateDistance(sampleList().get(i), centre())< minDist){
                   minDist= calculateDistance(sampleList().get(i), centre());
                   closestPoint= sampleList().get(i);

               }
               System.out.printf("Mininum Distance is :%f", minDist);
               System.out.printf(" and the is points for the same are:  "+ closestPoint);
           }

       }

}


