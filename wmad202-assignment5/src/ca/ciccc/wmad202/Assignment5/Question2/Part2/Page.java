package ca.ciccc.wmad202.Assignment5.Question2.Part2;

import java.util.HashMap;

public class Page {
    private final int pageNum;
    private final String context;

    public Page(int pageNum, String context) {
        this.context = context;
        this.pageNum= pageNum;

    }
    public int getPageNum(){
        return this.pageNum;

    }


    public String[] getWords(){
        String contextReplacedBySpace= this.context.replaceAll(",./<>?;:''*"," ");
        return contextReplacedBySpace.split(" ");

    }
    public HashMap<String, Integer> Occurances(){
        HashMap<String, Integer> getOccurances= new HashMap<>();
        for (String word: this.getWords()){
            if (getOccurances.containsKey(word)){
                getOccurances.put(word, getOccurances.get(word)+1);}
            else {
                getOccurances.put(word,1);
            }

        }
        return getOccurances;
    }


    }

