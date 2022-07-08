package ca.ciccc.wmad202.Assignment5.Question2.Part1;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price){
        this.name=name;
        this.price= price;
    }

    public String getName(){
        this.name= name;
        return name;
    }

    public double getPrice(){
        this.price=price;

        return price;
    }


}
