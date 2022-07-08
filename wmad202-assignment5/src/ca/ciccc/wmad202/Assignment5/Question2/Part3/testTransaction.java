package ca.ciccc.wmad202.Assignment5.Question2.Part3;

public class testTransaction {
    public void test(){
            Transaction transaction1= new Transaction(1, Transaction.Deposit, 20.1);
        Transaction transaction2= new Transaction(2, Transaction.Deposit, 25.5);
        Transaction transaction3= new Transaction(3, Transaction.Withdrawal, 15.5);
        Transaction transaction4= new Transaction(4, Transaction.Withdrawal, 10.5 );
        Transaction transaction5= new Transaction(5, Transaction.Deposit, 20.1);
        Transaction transaction6= new Transaction(6, Transaction.Withdrawal, 10.5);

        Bank Bank= new Bank();
        Bank.addtransaction(transaction1);
        Bank.addtransaction(transaction2);
        Bank.addtransaction(transaction3);
        Bank.addtransaction(transaction4);
        Bank.addtransaction(transaction5);

        Bank.printTransaction();

    }
}
