package ca.ciccc.wmad202.Assignment5.Question1;

import java.util.ArrayList;

public class Student {
    private int studentID;
    private ArrayList<Integer> grades;
    private String name;

    public Student(int studentID, ArrayList<Integer> grades, String name) {
        this.studentID = studentID;
        this.grades = grades;
        this.name = name;
    }

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.grades = new ArrayList<>();

    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public float calculateGPA() {
        int totalGrades = 0;
        for (Integer f : grades) {
            totalGrades += f;
        }
        return (float) totalGrades / this.grades.size();

    }

    public void printInfo() {
        System.out.printf("ID: %d\n", this.studentID);
        System.out.printf("List of Grades: %d\n", this.grades);
        System.out.printf("Name:%s\n ", this.name);
        System.out.printf("GPA: %f\n", this.calculateGPA());

    }

    public int compareGPA(Student otherStudent) {
        if (this.calculateGPA() > otherStudent.calculateGPA()) {
            return 1;
        } else if (this.calculateGPA() < otherStudent.calculateGPA()) {
            return -1;
        } else {
            return 0;

        }
    }
}


