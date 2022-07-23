package ca.ciccc.wmad202.Assignment7.Assignment7Driver;

import ca.ciccc.wmad202.Assignment7.Question1.Account;
import ca.ciccc.wmad202.Assignment7.Question1.Book;
import ca.ciccc.wmad202.Assignment7.Question1.Counter;
import ca.ciccc.wmad202.Assignment7.Question1.Student;
import ca.ciccc.wmad202.Assignment7.Question3.exchangeClass;
import ca.ciccc.wmad202.Assignment7.Question4.list;
import ca.ciccc.wmad202.Assignment7.Question5.RelativelyPrime;

import java.util.ArrayList;

public class Assignment7Driver {
    public static void run(){
        ArrayList<Book> books= new ArrayList<>();
        Book book1= new Book("Afi", 300, "red");
        Book book2= new Book("raj", 250,"black");
        Book book3= new Book("tin", 100,"white");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Counter<Book> counter1=new Counter<>(books);
        System.out.println(counter1.countNumberOfElements());

        ArrayList<Account> accounts= new ArrayList<>();
        Account account1=new Account("Raj",1254,60000);
        Account account2= new Account("Paa", 8746, 15000);
        Account account3= new Account("lim", 1265, 8000);
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        Counter<Account> Account= new Counter<>(accounts);
        System.out.println(Account.countNumberOfElements());


        ArrayList<Student> students= new ArrayList<>();
        Student Students1= new Student(6790, "Maths", 3.90);
        Student Students2= new Student(3214, "English", 2.50);
        Student Students3= new Student(3213,"History", 1.60);
        students.add(Students1);
        students.add(Students2);
        students.add(Students3);
        Counter<Student> Student= new Counter<>(students);
        System.out.println(Student.countNumberOfElements());



        ArrayList<Integer> StudentID= new ArrayList<>();
        StudentID.add(1234);
        StudentID.add(2732);
        StudentID.add(9384);
        StudentID.add(2345);

        exchangeClass <Integer> exchange= new exchangeClass<>(StudentID);
        exchange.ExchangeElements(1,2);
        System.out.println(exchange.getNumbers());

        System.out.println("=====================Question4========================");
        ArrayList<String> fruits= new ArrayList<>();
        fruits.add("lemon");
        fruits.add("orange");
        fruits.add("lichi");
        fruits.add("plum");

        list<String> Fruit= new list<>(fruits);
        Fruit.searchElement("orange");

        System.out.println("=======================Problem5========================");
        ArrayList <Integer> Number= new ArrayList<>();
        Number.add(11);
        Number.add(15);
        RelativelyPrime.unaryPredicate<Integer> p= num -> num == 1;
        System.out.println(RelativelyPrime.findFirst(Number,0,1,p));









        }
    }
