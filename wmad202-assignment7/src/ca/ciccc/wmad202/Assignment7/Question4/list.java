package ca.ciccc.wmad202.Assignment7.Question4;

import java.util.ArrayList;

public class list<e> {
    private ArrayList<e> list;

    public list(ArrayList<e> list){
        this.list=list;
    }
    public list(){
        this.list=new ArrayList<>();
    }
    public void  addItem(e T){
        this.list.add(T);
    }
    public void removeItem(e T){
        this.list.remove(T);
    }
    public void searchElement(e items){
            if (this.list.contains(items)){
                System.out.println(items+"is in the list at index"+ this.list.indexOf(items));}
                else{
                System.out.println("null");
            }
        }
    }

