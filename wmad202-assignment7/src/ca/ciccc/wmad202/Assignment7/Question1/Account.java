package ca.ciccc.wmad202.Assignment7.Question1;

public class Account implements Specific {
    private String name;
    private int ID;
    private double amount;

    public Account(String name,int ID, double amount){
        this.name=name;
        this.ID=ID;
        this.amount=amount;
    }
     public boolean hasSpecificProperty(){
        return this.amount>10000;
     }
}
