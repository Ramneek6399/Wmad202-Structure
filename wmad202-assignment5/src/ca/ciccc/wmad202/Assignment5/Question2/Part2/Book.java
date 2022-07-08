package ca.ciccc.wmad202.Assignment5.Question2.Part2;

import java.util.HashMap;
import java.util.HashSet;

public class Book {
    private final String author;
    private final HashSet<Page> pages;

    public Book( String author){
        this.author=author;
        this.pages= new HashSet<>();

    }
    public  Book(String author, HashSet<Page> pages){
        this.author=author;
        this.pages=pages;
    }

    public void addPage( Page page){
        this.pages.add(page);
    }

    private HashMap<String,Integer> getAllOccurances(){
        HashMap<String,Integer> getAllOccurances= new HashMap<>();

        for (Page p: this.pages){
            HashMap<String,Integer> occurancesPerPage= p.Occurances();
            for (String key: occurancesPerPage.keySet()){
                if (getAllOccurances.containsKey(key)){
                    getAllOccurances.put(key, getAllOccurances.get(key)+ occurancesPerPage.get(key));
                } else {
                    getAllOccurances.put(key,occurancesPerPage.get(key));
                }

            }

        }
        return getAllOccurances;
    }
    public void getParticularWordOccurances(String word){
        System.out.printf("%s : %d\n", word, this.printParticularOccurance(word));
    }
    private Integer printParticularOccurance(String word){
        HashMap<String,Integer> allWordOccurances= this.getAllOccurances();

        return allWordOccurances.getOrDefault(word,0);
    }
    public void printAllOccurances(){
        HashMap<String, Integer> allOccrances= this.getAllOccurances();
        for (String key: allOccrances.keySet()){
            System.out.printf("%s: %d\n", key, allOccrances.get(key));
        }
    }
}
