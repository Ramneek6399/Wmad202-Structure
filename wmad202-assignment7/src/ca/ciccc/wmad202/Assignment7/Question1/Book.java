package ca.ciccc.wmad202.Assignment7.Question1;

public class Book implements Specific {
    private String author;
    private int pages;
    private String colour;

    public Book(String author,int pages, String colour){
        this.author=author;
        this.pages=pages;
        this.colour=colour;
    }

    public boolean hasSpecificProperty(){
        return this.pages>200;
    }
}
