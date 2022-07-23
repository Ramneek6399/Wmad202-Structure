package ca.ciccc.wmad202.Assignment7.Question1;

import java.util.ArrayList;

public class Counter<e extends Specific>{
    private ArrayList<e> object;

    public Counter(ArrayList<e> object){
        this.object=object;
    }

    public int countNumberOfElements(){
        int count=0;

        for (e object:this.object){
            if (object.hasSpecificProperty()){
                count++;
            }
        }
        return count;
    }


}
