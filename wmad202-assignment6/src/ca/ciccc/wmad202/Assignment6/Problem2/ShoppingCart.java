package ca.ciccc.wmad202.Assignment6.Problem2;

import ca.ciccc.wmad202.Assignment6.problem0.Product;

import java.util.ArrayList;

public class ShoppingCart implements Cart {
    private ArrayList<Product> products;

    public ShoppingCart(ArrayList<Product> products){
        this.products= products;
    }
    public ShoppingCart(){
        this.products= new ArrayList<>();
    }
    public void addProducts(Product product){
        this.products.add(product);
    }
    public void removeProducts(Product product){
        this.products.remove(product);
    }
    public float TotalPrice(){
        float total =0;
        for (Product product: this.products){
            total+= product.getProductPrice();

        }

        return total;
    }
    public void printReciept(){
        for (Product product: this.products){
            System.out.printf("%s, Price:%f \n", product,product.getProductPrice());
        }
    }
    public void printRecieptInDetail(){
        for (Product product : this.products){
        System.out.println(product.toString());
    }
}}
