package ca.ciccc.wmad.assignment3.main;

import ca.ciccc.wmad.assignment3.Question1.Question1;
import ca.ciccc.wmad.assignment3.Question10.Question10;
import ca.ciccc.wmad.assignment3.Question2.Question2;
import ca.ciccc.wmad.assignment3.Question3.Question3;
import ca.ciccc.wmad.assignment3.Question4.Question4;
import ca.ciccc.wmad.assignment3.Question5.Question5;
import ca.ciccc.wmad.assignment3.Question6.Question6;
import ca.ciccc.wmad.assignment3.Question7.Question7;
import ca.ciccc.wmad.assignment3.Question8.Question8;
import ca.ciccc.wmad.assignment3.Question9.Question9;

public class Assignment3Driver {
    public static void run(){
        //Question1.isNumPrime();
        //Question2.theNextPrimeNum();
        //Question3.printPattern();
        //Question4.theRepeatedNumber();
        //Question5.theRepeatedNumber();
        //Question6.theRepeatedNumber();
        //Question7.linearSearch();
        //Question8.Nums();
        //Question9.thePrimeInList();
        //x0,x1,x2,x3
        int [] p1={5,0,1,0,8,10,0,0,0,0,0};
        //10*x^5 + 8*x^4 + x^2 + 5
        //Question10.theHighestExValue(p1);
        int[] p2= {10,0,0,7,4,0,0,0,0,0,0};
        Question10.combiningPolynomials(p1,p2);
    }
}
