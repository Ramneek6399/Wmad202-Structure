package ca.ciccc.wmad202.Assignment5.Question2.Part3;

public class Transaction {
    private int id;
    private String type;
    private double amount;

    public static String Deposit= "Deposit";
    public static String Withdrawal= "Withdrawal";

    public Transaction( int id, String type, double amount){
        this.id=id;
        this.type=type;
        this.amount=amount;
    }

    public int getId(){
        this.id=id;

        return id;
    }
    public  String getType(){
        this.type=type;

        return type;
    }
    public double getAmount(){
        this.amount=amount;
        return amount;
    }
}
