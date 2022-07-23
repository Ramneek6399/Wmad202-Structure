package ca.ciccc.wmad202.Assignment7.Question3;

import java.util.ArrayList;

public class exchangeClass<e>{

    private ArrayList<e> numbers;

    public exchangeClass(ArrayList<e>numbers){
        this.numbers=numbers;
    }
    public exchangeClass(){
        this.numbers= new ArrayList<>();
    }

    public void addnum( e number){
        this.numbers.add(number);

    }
    public void ExchangeElements(int index1, int index2){
        e element1= this.numbers.get(index1);
        e element2= this.numbers.get(index2);

        this.numbers.set(index1, element2);
        this.numbers.set(index2, element1);


    }
    public ArrayList<e> getNumbers(){

        return this.numbers;
    }
}
