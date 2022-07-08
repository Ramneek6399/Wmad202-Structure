package ca.ciccc.wmad202.Assignment5.Question3;

import java.util.Arrays;

public class polynomialCalculation {
    private final int[] p1;
    private final int[] p2;

    public polynomialCalculation(int[] p1, int[] p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public boolean ifPolynomialAreEqual() {
        return Arrays.equals(this.p1, this.p2);
    }

    public static boolean checkSingleFactorEquality(int[] s1, int[] s2) {
        return Arrays.equals(s1, s2);
    }

    public int[] theBiggestExponent() {
        int[] theBiggestExponent= new int[2];
        theBiggestExponent[0] = theBiggestExponentInArray(this.p1);
        theBiggestExponent[1] = theBiggestExponentInArray(this.p2);
        return theBiggestExponent;
    }

    private int theBiggestExponentInArray(int[] p) {
        int biggestexpo = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i] != 0) {
                biggestexpo = i;
            }
        }
        return biggestexpo;
    }

    public void printPolynomialEquation(int[] p) {
        int printCount = 0;
        for (int i = p.length - 1; i >= 0; i--) {
            if (i == 0) {
                if (p[i] != 0) {
                    if (printCount == 0 || p[i] < 0) {
                        System.out.printf("%d", p[i]);
                    } else {
                        System.out.printf("+%d", p[i]);
                    }
                    printCount++;

                } }else if (i == 1) {
                if (p[i] != 0) {
                    if (printCount == 0 || p[i] < 0) {
                        System.out.printf("%d*x", p[i]);
                    } else {
                        System.out.printf("+%d*x", p[i]);
                    }
                    printCount++;

                }

                } else {
                    if (p[i] != 0) {
                        if (printCount == 0 || p[i] < 0) {
                            System.out.printf("%d*x^%d", p[i], i);
                        } else {
                            System.out.printf("+%d*x%d", p[i], i);
                        }
                        printCount++;
                    }

                }
            }

        System.out.println();
    }
    public int[] printCombinedPolynomials(){
        int[] result=new int[11];
        for (int i=0; i<this.p1.length; i++){
            for (int i1=0; i1<this.p2.length; i++){
                if (i==i1){
                    result[i]= this.p1[i]+ this.p2[i1];
                }
            }
        }
        return result;
    }
}