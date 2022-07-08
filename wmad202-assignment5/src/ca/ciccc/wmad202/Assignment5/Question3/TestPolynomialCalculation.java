package ca.ciccc.wmad202.Assignment5.Question3;

import java.util.Arrays;

public class TestPolynomialCalculation {
    public void test(){
        int[] s1={0,0,0,-4,0,0,0,0}; //-4x^3
        int[] s2={0,0,0,-4,0,0,0,0}; //-4x^3
        int[] p1={0,2,-3,0,0,5,0,0,0,0,0}; //2x-3x^2+5x^5
        int[] p2={3,0,0,6,5,3,0,0,0,0,0}; // 6x^3+5x^4+5x^5+3

        System.out.println(polynomialCalculation.checkSingleFactorEquality(s1,s2));

        polynomialCalculation polynomialCalculation = new polynomialCalculation(p1,p2);
        System.out.println(polynomialCalculation.ifPolynomialAreEqual());

        System.out.println(Arrays.toString(polynomialCalculation.theBiggestExponent()));
        polynomialCalculation.printPolynomialEquation(polynomialCalculation.printCombinedPolynomials());




    }
}
