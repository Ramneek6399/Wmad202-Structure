package ca.ciccc.wmad.assignment3.Question10;

import java.util.Arrays;

public class Question10 {
    public static boolean ifTwoStatementsAreEqual(int[] s1, int[] s2) {
        return Arrays.equals(s1, s2);
    }

    public static boolean ifTwoPolynomialsAreEqual(int[] p1, int[] p2) {
        return Arrays.equals(p1, p2);
    }

    public static void theHighestExValue(int[] p1) {
        int theHighestExponancial = 0;

        for (int i = 0; i < p1.length; i++) {
            if (p1[i] != 0) {
                theHighestExponancial = i;
            }

        }
        System.out.printf(" The highest Exponential value: %d", theHighestExponancial);


    }

    public static void combiningPolynomials(int[] p1, int[] p2) {
        int[] result = new int[11];

        for (int i = 0; i < p1.length; i++) {
            for (int i1 = 0; i1 < p2.length; i1++) {
                if (i == i1) {
                    result[i] = p1[i] + p2[i1];
                }
            }
        }
        int count=0;
        for (int i=result.length -1; i>=0; i--){
            if (i==0){
                if(result[i]!= 0){
                    if(count ==0 || result[i]<0){
                        System.out.printf("%d", result[i]);
                    }
                    else {
                        System.out.printf("+%d", result[i]);
                    }
                    count++;
                }
            }
            else if (i==1){
                if(result[i]!= 0){
                    if(count ==0 || result[i]<0){
                        System.out.printf("%d", result[i]);
                    }
                    else {
                        System.out.printf("+%d", result[i]);
                    }
                    count++;
            }
        } else{
                if (result[i]!=0){
                    if(count ==0 || result[i]<0){
                        System.out.printf("%d^%d", result[i],i);
                    }
                    else {
                        System.out.printf("+%d^%d", result[i],i);
                    }
                    count++;
                }

                }
            }
        System.out.println(" ");
    }
}