package main;

import Problem1.Problem1;
import Problem2.Problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class main {
    public static void main(String args[]) {
        Consumer<Integer> y = new Problem1();
        y.accept(10);

        Consumer<Double> d = (i) -> {
            System.out.println(" my GPA is " + i);
            System.out.println(" This is my overall course score");
        };
        d.accept(3.55);


        Consumer<Double> c = new Consumer<Double>() {
            @Override
            public void accept(Double i) {
                System.out.println(" my GPA is " + i);

            }
        };
        c.accept(3.55);

        System.out.println("==========================Interface Predicate================");


       ArrayList<Integer> A= new ArrayList<>();

        A.add(3);
        A.add(4);
        A.add(2);
        A.add(3);
        A.add(8);
        A.add(7);
        A.add(9);


        List<Integer>N = A.stream().filter(i -> i>5).collect(Collectors.toList());


      // List<Integer> N =A.stream().filter((i) -> i>5).collect(Collectors.toList());
        System.out.println(N);
        System.out.println("===========================Supplier_Interface====================");

        Supplier<String> I= ()-> "Hi, Thanks you for visiting. Receptionist can assist you if you have any questions ";
        System.out.println(I.get());

        

        };

    }


