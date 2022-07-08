package ca.ciccc.wmad202.Assignment5.Question2.Part3;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Transaction> transactions;
    private double totalBalance;

    public Bank(ArrayList<Transaction> transactions, double totalBalance) {
        this.totalBalance = totalBalance;
        this.transactions = transactions;
    }

    public Bank() {
        this.transactions = new ArrayList<>();
        this.totalBalance = 0;

    }

    public void addtransaction(Transaction transaction) {
        if (transaction.getType().equals(Transaction.Withdrawal) && this.totalBalance < transaction.getAmount()) {
            System.out.println(" The amount large than balance");
            System.out.printf("ID: %d and Amount: %f", transaction.getId(), transaction.getAmount());
        }
        this.transactions.add(transaction);
        for (Transaction t : transactions) {
            if (transaction.getType().equals(Transaction.Deposit)) {
                totalBalance += t.getAmount();}
            else if (transaction.getType().equals(Transaction.Withdrawal)){
                    totalBalance -=t.getAmount();
                }
            }

        }


    public void printTransaction(){
        for (Transaction trans: this.transactions){
            System.out.printf("ID: %d\n", trans.getId());
            System.out.printf("Type: %s\n", trans.getType());
            System.out.printf("Amount: %f\n", trans.getAmount());
        }
        System.out.printf(" Total Balance:"+ totalBalance);
    }
}