package ca.ciccc.wmad.assignment2.Question7;

import java.util.Scanner;


import static java.lang.Math.sqrt;

public class Question7 {
    public static float AreaOfCircle() {

        final double PI = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter side of the square ");
        float side = in.nextFloat();

        float Daigonal = (float) (side * Math.sqrt(2));
        float radius = Daigonal / 2;

        float area = (float) Math.pow(radius * PI, 2);

        System.out.printf("area is %f", area);
        return side;
    }



}




