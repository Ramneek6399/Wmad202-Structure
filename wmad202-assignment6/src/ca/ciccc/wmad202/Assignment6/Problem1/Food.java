package ca.ciccc.wmad202.Assignment6.Problem1;

import ca.ciccc.wmad202.Assignment6.problem0.Product;

import java.util.ArrayList;

public class Food extends Product {
    private Integer foodCalorie;
    private int foodSize;
    private ArrayList<String> foodIngredients;

    public Food(
            int productID,
            String productName,
            float productPrice,
            String productMadeInCountry,
            int foodCalorie,
            ArrayList<String> foodIngredients,
            int foodSize
             ){
        super(productID, productName, productPrice, productMadeInCountry);

        this.foodCalorie=foodCalorie;
        this.foodSize=foodSize;
        this.foodIngredients= foodIngredients;


    }

    @Override
    public String toString() {
        return "ID: "+this.ProductID+"\n"+"Name: "+this.productName+"\n"+"Price: "+this.productPrice+"\n"+"Made in: "+this.productMadeInCountry+"\n"+"food Calories"+this.foodCalorie+"\n"+"food Size"+this.foodSize+"\n"+"Food Ingredients"+this.foodIngredients;
    }
}
