package main;

import Basics.JavaBasics;
import SampleAnonymousClass.HelloWorldAnonymousClasses;

public class LectureNoteDriver {
    public static void run() {
        // JavaBasics.isPersonAllowedInClub();

        //JavaBasics.evaluate(87);
        //JavaBasics.evaluate(60);
        //JavaBasics.evaluate(23);


        //JavaBasics.calculateAverage();

        //System.out.printf("%c",JavaBasics.theMinimumChar("RAMNEEK"));

        JavaBasics.isNumPrime(5);
        JavaBasics.isNumPrime(13);


        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello();

    }
}