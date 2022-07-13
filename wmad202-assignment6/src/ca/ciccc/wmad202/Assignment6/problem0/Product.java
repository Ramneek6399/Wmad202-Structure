package ca.ciccc.wmad202.Assignment6.problem0;

public class Product {
    protected int ProductID;
    protected String productName;
    protected Float productPrice;
    protected String productMadeInCountry;

    public Product( int productID, String productName,float productPrice, String productMadeInCountry){
        this.ProductID=productID;
        this.productName=productName;
        this.productPrice=productPrice;
        this.productMadeInCountry=productMadeInCountry;



    }
    public Float getProductPrice(){
        return this.productPrice;
    }

    @Override
    public String toString() {
        return "ID: "+this.ProductID+"\n"+"Name: "+this.productName+"\n"+"Price: "+this.productPrice+"\n"+"Made in: "+this.productMadeInCountry;
    }
}
