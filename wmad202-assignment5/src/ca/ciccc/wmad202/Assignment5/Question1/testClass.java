package ca.ciccc.wmad202.Assignment5.Question1;

import java.util.ArrayList;
import java.util.HashSet;

public class testClass {
    public void test(){
        ArrayList<Integer> marks= new ArrayList<>();
        marks.add(80);
        marks.add(78);
        marks.add(65);
        marks.add(34);
        Student student1= new Student(77889911,marks,"Dave");
        Student student2= new Student(66553322, "James");
        student2.addGrade(87);
        student2.addGrade(63);
        student2.addGrade(45);
        student2.addGrade(91);

        float result1= student1.calculateGPA();
        System.out.println(result1);

        float result2= student2.calculateGPA();
        System.out.println(result2);




    }
}
