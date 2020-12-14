package com.example.wordcounter;

public class TextCounter {
    public static int getCharsCount(String text) {
        return text.length();
    }


    public static int countStrings(String text)

    {
        int dot_split;
        int cama_split;
       // if(text.contains(".") || text.contains(","))
            dot_split = text.split("\\.").length -1;
            cama_split = text.split(",").length -1;
            if(dot_split == -1) {dot_split = 0;}
            if(cama_split == -1) {cama_split = 0;}
        return text.split("\\s+").length + cama_split + dot_split ;
    }

}

