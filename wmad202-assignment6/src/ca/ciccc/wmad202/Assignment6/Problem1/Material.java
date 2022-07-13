package ca.ciccc.wmad202.Assignment6.Problem1;

import ca.ciccc.wmad202.Assignment6.problem0.Product;

import java.util.ArrayList;

public class Material  {
    private Integer MaterialCode;
    private String MaterialName;

    public Material(int MaterialCode, String MaterialNAme){
        this.MaterialCode= MaterialCode;
        this.MaterialName= MaterialNAme;
    }

    @Override
    public String toString() {
        return "MaterialName: "+this.MaterialName+"MaterialNAme: "+this.MaterialCode+"\n";
    }
}
