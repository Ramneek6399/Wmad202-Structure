package ca.ciccc.wmad.assignment2.Question10;

public class Question10 {
    public static void test(){
        double F1x=0;
        double F2x=0;
        int x=3;
        while(F1x<=F2x) {
            F1x = Math.pow(2, x);
            F2x = Math.pow(x, 5);
            System.out.println("x="+x+" F1x=" + F1x + " F2x=" + F2x);
            x++;
        }
        System.out.println("x=" + x + " F1x=" + F1x + " F2x=" + F2x);


        }

    }


