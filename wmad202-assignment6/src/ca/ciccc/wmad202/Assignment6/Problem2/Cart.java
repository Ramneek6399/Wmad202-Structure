package ca.ciccc.wmad202.Assignment6.Problem2;

import ca.ciccc.wmad202.Assignment6.problem0.Product;

public interface Cart {
    public void addProducts(Product product);
    public void removeProducts(Product product);
    public float TotalPrice();
    public void printReciept();
    public void printRecieptInDetail();
}
