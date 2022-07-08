package ca.ciccc.wmad202.Assignment5.Question2.Part1;

import java.util.ArrayList;
import java.util.HashMap;

public class Invoice {
        private ArrayList<Product> products;

        public Invoice() {
            this.products = new ArrayList<>();
        }
        public Invoice(ArrayList<Product> products) {
            this.products = products;
        }
        public  void addproduct(Product product) {
            this.products.add(product);
        }
        public void clearProducts() {
            this.products = new ArrayList<>();
        }
        public void  printAllProducts() {
            for (Product p : this.products) {
                System.out.printf("name: %s, price: %f", p.getName(), p.getPrice());
            }
        }

        private double  getTotalPrice() {
            double total = 0;

            for (Product p : this.products) {
                total += p.getPrice();
            }
            return total;
        }
        public void printTotalPrice() {
            System.out.printf("Total: $%f", this.getTotalPrice());
        }
    }




