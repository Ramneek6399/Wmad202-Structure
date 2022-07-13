package ca.ciccc.wmad202.Assignment6.Problem1;

import ca.ciccc.wmad202.Assignment6.problem0.Product;

import java.util.ArrayList;

public class Cloth extends Product {
    private ArrayList<Material> ClothMaterials;
    public Cloth(int productID, String productName,float productPrice, String productMadeInCountry, ArrayList<Material>clothMaterials){
        super( productID, productName,productPrice, productMadeInCountry);
        this.ClothMaterials= clothMaterials;
    }

    @Override
    public String toString() {
        return "Cloth ID: "+this.ProductID+"\n"+"Name: "+this.productName+"\n"+"Cloth Price: "+this.productPrice+"\n"+"Made in: "+this.productMadeInCountry+"\n"+"Cloth Materials"+this.ClothMaterials+"\n";
    }
}
