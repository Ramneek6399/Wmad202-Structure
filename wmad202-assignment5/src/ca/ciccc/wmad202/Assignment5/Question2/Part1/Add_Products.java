package ca.ciccc.wmad202.Assignment5.Question2.Part1;

public class Add_Products {
    public void test(){
        Invoice invoice= new Invoice();

        Product pen= new Product("pen", 10.5);
        Product pencil= new Product("pencil", 5.0);
        Product book= new Product("book", 50.0);
        Product eraser= new Product("eraser", 3.5);

        invoice.addproduct(pen);
        invoice.addproduct(pencil);
        invoice.addproduct(book);
        invoice.addproduct(eraser);

        invoice.printAllProducts();
        invoice.printTotalPrice();
    }
}
