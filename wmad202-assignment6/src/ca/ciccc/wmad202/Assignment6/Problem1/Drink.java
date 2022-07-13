package ca.ciccc.wmad202.Assignment6.Problem1;

import ca.ciccc.wmad202.Assignment6.problem0.Product;

public class Drink extends Product {
    private int drinkID;
    private String drinkName;
    private Float drinkPrice;
    private String drinkMadeInCountry;
    private Boolean isDrinkDiet;
    private Integer drinkSize;

    public Drink( int productID, String productName,float productPrice, String productMadeInCountry, boolean isDrinkDiet, int drinkSize ){
        super( productID,productName,productPrice, productMadeInCountry);
        this.isDrinkDiet= isDrinkDiet;
        this.drinkSize= drinkSize;
    }

    @Override
    public String toString() {
        return "ID: "+this.ProductID+"\n"+"Name: "+this.productName+"\n"+"Price: "+this.productPrice+"\n"+"Made in: "+this.productMadeInCountry+"\n"+"Is drink diet?"+this.isDrinkDiet+"\n"+"Drink Size"+this.drinkSize;
    }
}
