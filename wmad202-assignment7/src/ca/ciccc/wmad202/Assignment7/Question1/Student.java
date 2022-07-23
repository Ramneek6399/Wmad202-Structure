package ca.ciccc.wmad202.Assignment7.Question1;

public class Student implements Specific {
    private int ID;
    private String course;
    private double GPA;

    public Student(int ID, String course, double GPA){
        this.ID=ID;
        this.course=course;
        this.GPA=GPA;
    }
    public boolean hasSpecificProperty(){
        return this.GPA>3.00;
    }

}
